package algo05;
import java.util.Scanner;

public class q2 {
    // Construa um programa em Java e seu respectivo fluxograma para o seguinte problema: Informado o valor
    // total do orçamento de um projeto e a quantidade de erros críticos apontados pela auditoria. Primeiro,
    // identifique se a quantidade de erros críticos é maior que 5; caso verdadeiro, mostre: "Projeto 
    // Rejeitado pela Auditoria". Caso negativo, calcule o custo por etapa (dividindo o orçamento pelas 2 
    // etapas iniciais) e verifique se esse custo médio é menor que R$ 50.000,00; caso afirmativo, mostre: 
    // "Projeto Aprovado". Caso negativo, colete o valor de um aporte financeiro adicional (terceira variável),
    // recalcule a média do orçamento dividida por 3 etapas e verifique novamente se a nova média é menor que
    // R$ 50.000,00. Caso afirmativo, mostre: "Projeto Aprovado com Recursos Extras"; caso negativo, mostre: 
    // "Projeto Rejeitado por Estourar o Orçamento".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double VT, etapas, AF;
        int EC;

        System.out.print("Digite o valor total do orçamento do projeto: ");
        VT = scanner.nextDouble();

        System.out.print("Digite a quantidade de erros críticos apontados pela auditoria: ");
        EC = scanner.nextInt();

        if (EC > 5) {
            System.out.println("Projeto Rejeitado pela Auditoria.");
        } else {
            etapas = VT / 2;
            if (etapas < 50000) {
                System.out.println("Projeto Aprovado.");
            } else {
                System.out.print("Digite o valor do aporte financeiro adicional: ");
                AF = scanner.nextDouble();
                etapas = (VT + AF) / 3;
                if (etapas < 50000) {
                    System.out.println("Projeto Aprovado com Recursos Extras.");
                } else {
                    System.out.println("Projeto Rejeitado por Estourar o Orçamento.");
                }
            }
        }

        scanner.close();
    }
}
