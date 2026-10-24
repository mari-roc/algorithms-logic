package algo07;
import java.util.Scanner;

public class q4 {
    //Crie uma função que receba dois numeros inteiros, BASE e EXPONENTE e retorne o valor da potencia 
    //do numero exemplo 2 elevado a 3 = 8
    public static int potencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();
        int resultado = potencia(base, expoente);
        System.out.printf("O resultado de %d elevado a %d é: %d%n", base, expoente, resultado);
        scanner.close();
    }
}
