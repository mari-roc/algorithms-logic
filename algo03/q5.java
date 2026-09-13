package algo03;
import java.util.Scanner;

public class q5 {
    // Faça um programa em java e seu respectivo fluxograma que dada uma distancia
    // em km converta e exiba em milhas, onde 1Milha = 1,60934km

    public static void main(String[] args) {
        double km, milhas;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância em km: ");
        km = scanner.nextDouble();
        
        milhas = km / 1.60934;
        
        System.out.printf("Distância em milhas: %.2f%n", milhas);
    }
}
