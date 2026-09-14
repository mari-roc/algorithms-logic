package algo04;
import java.util.Scanner;

public class q4 {
    // Faça um programa em java e seu respectivo fluxograma que dado um salario informado e uma 
    // parcela de emprestimo solicitado, calcule 30% do salario, caso o valor da parcela do emprestimo 
    // for maior que 30% do salario, mostre a mensagem, emprestimo nao concedido e mostre a margem atual,
    // caso o percentual for menor, mostre a mensagem: emprestimo concedido

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sal, parc, p30;

        System.out.println("Digite o valor do salário:");
        sal = scanner.nextDouble();

        System.out.println("Digite o valor da parcela do empréstimo:");
        parc = scanner.nextDouble();

        p30 = sal * 0.30;

        if (parc <= p30) {
            System.out.println("Empréstimo concedido.");
        } else {
            System.out.printf("Empréstimo não concedido. Margem atual: %.2f%n", p30);
        }
    }
}
