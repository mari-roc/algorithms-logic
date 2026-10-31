package algo08 ;
import java.util.Scanner;

public class q1 {
    //Maior, Menor e Média Crie um programa em Java que leia um vetor de 10 números inteiros fornecidos pelo usuário. Em seguida, o programa deve calcular e exibir:
    //O maior valor armazenado no vetor.
    //O menor valor armazenado no vetor.
    //A média aritmética dos elementos do vetor.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        // Leitura dos números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        // Cálculo do maior, menor e média
        int maior = vetor[0];
        int menor = vetor[0];
        double media = (double) soma / 10;

        // Encontrar o maior e o menor valor
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Exibição dos resultados
        System.out.println("O maior valor armazenado no vetor é: " + maior);
        System.out.println("O menor valor armazenado no vetor é: " + menor);
        System.out.println("A média aritmética dos elementos do vetor é: " + media);
    }
}
