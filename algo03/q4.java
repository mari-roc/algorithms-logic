package algo03;
import java.util.Scanner;

public class q4 {
    // Faça um programa em java e seu respectivo fluxograma que leia Três valores:
    // Distancia em km, Velocidade Media e consumo de Combustível de um carro,
    // calcule o tempo de viagem e quantos litros de combustível serão necessários
    // para completar a viagem. 
    
    public static void main(String[] args) {
        double dist, vm, comb, temp, L;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância em km: ");
        dist = scanner.nextDouble();
        
        System.out.print("Digite a velocidade média em km/h: ");
        vm = scanner.nextDouble();
        
        System.out.print("Digite o consumo de combustível em km/l: ");
        comb = scanner.nextDouble();
        
        temp = dist / vm;
        L = dist / comb;
        
        System.out.printf("Tempo de viagem: %.2f%n", temp);
        System.out.printf("Litros de combustível necessários: %.2f%n", L);
    }
}
