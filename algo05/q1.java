package algo05;
import java.util.Scanner;

public class q1 {
    // Construa um programa em java e seu respectivo fluxograma para o seguinte problema: informada 
    // duas notas p1 e p2 e a quantidade de faltas, primeiro identifique se as faltas são maior que 
    // 20, caso verdadeiro mostre: aluno reprovado por faltas, caso negativo, calcule a media de p1 
    // e p2 e verifique se a media e maior que 6 caso afirmativo mostre aluno aprovado, caso negativo 
    // colete a variável p3 e calcule a media aritmética entre as 3 e verifique novamente se a media 
    // recalculada e maior que 6 caso afirmativo mostre, aluno aprovado no exame, caso negativo aluno
    // reprovado no exame

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota P1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Digite a nota P2: ");
        double p2 = scanner.nextDouble();

        System.out.print("Digite a quantidade de faltas: ");
        int faltas = scanner.nextInt();

        if (faltas > 20) {
            System.out.println("Aluno reprovado por faltas.");
        } else {
            double media = (p1 + p2) / 2;
            if (media >= 6) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.print("Digite a nota P3: ");
                double p3 = scanner.nextDouble();
                double mediap3 = (p1 + p2 + p3) / 3;
                if (mediap3 >= 6) {
                    System.out.println("Aluno aprovado no exame.");
                } else {
                    System.out.println("Aluno reprovado no exame.");
                }
            }
        }

        scanner.close();
    }
    
}
