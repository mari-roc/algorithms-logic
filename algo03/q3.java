package algo03;
import java.util.Scanner;
public class q3 {
    // Faça um programa em java e seu respectivo fluxograma
    // que calcule a media ponderada de 3 números reais (A,B e C)
    // mostre o resultado onde os pesos serão (2,3,5)
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B, C, media;

        System.out.println("Qual o valor para A?");
        A = scanner.nextDouble();   
       
        System.out.println("Qual o valor para B?");
        B = scanner.nextDouble();

        System.out.println("Qual o valor para C?");
        C = scanner.nextDouble();

        media = (A * 2 + B * 3 + C * 5) / 10;

        System.out.println("A média ponderada é: " + media);
    }

}
