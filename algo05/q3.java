package algo05;
import java.util.Scanner;

public class q3 {
    // Construa um programa em Java e seu respectivo fluxograma para o seguinte problema: Informada a pressão
    // arterial sistólica do paciente e duas medições de temperatura (t1 e t2). Primeiro, identifique se a
    // pressão arterial sistólica é maior que 180 (crise hipertensiva); caso verdadeiro, mostre: 
    // "Encaminhamento Imediato para Emergência". Caso negativo, calcule a média das temperaturas t1 e t2 e 
    // verifique se a média é menor que 37.5°C; caso afirmativo, mostre: "Paciente Liberado / Triagem Verde". 
    // Caso negativo (indicando febre), colete a medição da frequência cardíaca do paciente e calcule a média
    // combinada dos três indicadores clínicos. Verifique se essa nova média passa do limite de alerta 
    // estabelecido; caso afirmativo, mostre: "Paciente em Observação"; caso negativo, mostre: "Paciente 
    // Medicado e Liberado".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p, t1, t2, t3, media;

        System.out.print("Digite a pressão arterial sistólica do paciente: ");
        p = scanner.nextDouble();

        System.out.print("Digite a primeira medição de temperatura (t1): ");
        t1 = scanner.nextDouble();

        System.out.print("Digite a segunda medição de temperatura (t2): ");
        t2= scanner.nextDouble();

        if (p > 180) {
            System.out.println("Encaminhamento Imediato para Emergência.");
        } else {
            media = (t1 + t2) / 2;
            if (media < 37.5) {
                System.out.println("Paciente Liberado / Triagem Verde.");
            } else {
                System.out.print("Digite a nova medição de temperatura (t3): ");
                t3 = scanner.nextDouble();
                
                media = (t1 + t2+ t3) / 3;
                if (media > 100) { 
                    System.out.println("Paciente em Observação.");
                } else {
                    System.out.println("Paciente Medicado e Liberado.");
                }
            }
        }

        scanner.close();
    }
}
