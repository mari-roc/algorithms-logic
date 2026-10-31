package algo08;
import java.util.Scanner;

public class q3 {
   // Inversão de Vetor Escreva um programa em Java que leia um vetor de 6 números inteiros. O programa deve inverter a ordem dos elementos diretamente no próprio vetor (ou utilizando um vetor auxiliar) e exibir os valores resultantes após a inversão.
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];

        // Leitura dos números
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        // Inversão do vetor
        for (int i = 0; i < 3; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[5 - i];
            vetor[5 - i] = temp;
        }

        // Exibição do vetor invertido
        System.out.println("Vetor invertido:");
        for (int i = 0; i < 6; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
