package algo08;
import java.util.Scanner;

public class q4 {
    // Separação de Pares e Ímpares Faça um programa em Java que leia 10 números inteiros e os armazene em um vetor principal. Em seguida, crie outros dois vetores: um para armazenar apenas os números pares e outro para os números ímpares presentes no vetor original. Ao final, exiba o conteúdo dos dois novos vetores.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorPrincipal = new int[10];
        int[] pares = new int[10];
        int[] ímpares = new int[10];
        int contadorPares = 0;
        int contadorÍmpares = 0;

        // Leitura dos números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetorPrincipal[i] = scanner.nextInt();
        }

        // Separação de pares e ímpares
        for (int i = 0; i < 10; i++) {
            if (vetorPrincipal[i] % 2 == 0) {
                pares[contadorPares] = vetorPrincipal[i];
                contadorPares++;
            } else {
                ímpares[contadorÍmpares] = vetorPrincipal[i];
                contadorÍmpares++;
            }
        }

        // Exibição dos vetores separados
        System.out.println("Números pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("Números ímpares:");
        for (int i = 0; i < contadorÍmpares; i++) {
            System.out.print(ímpares[i] + " ");
        }
        System.out.println();
    }
}
