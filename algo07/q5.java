package algo07;
import java.util.Scanner;

public class q5 {
    //Crie uma função que receba um numero, calcule e retorne o fatorial do numero informado: exemplo Fatorial
    // de 3 = 6
    
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int resultado = fatorial(numero);
        System.out.printf("O fatorial de %d é: %d%n", numero, resultado);
        scanner.close();
    }
}
