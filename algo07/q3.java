package algo07;
import java.util.Scanner;

public class q3 {
    //Implemente o laço faça enquanto com a pergunta deseja continua S/N para implementar a repetição 
    //do algorimo de caixa eletronico, usando na atividade de SWITCH CASE


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito inicial: ");
        double saldo = scanner.nextDouble();

        int escolha;
        boolean continuar = true;

        System.out.print("Deseja continuar? (S/N): ");
        String resposta = scanner.next();
        continuar = resposta.equalsIgnoreCase("S");

        while (continuar) {
            do {
                System.out.println("\nMenu:");
                System.out.println("1 — Consultar saldo");
                System.out.println("2 — Depositar");
                System.out.println("3 — Sacar");
                System.out.println("4 — Sair");
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                        break;
                    case 2:
                        System.out.print("Digite o valor a depositar: ");
                        double deposito = scanner.nextDouble();
                        saldo += deposito;
                        System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n", saldo);
                        break;
                    case 3:
                        System.out.print("Digite o valor a sacar: ");
                        double saque = scanner.nextDouble();
                        if (saque <= saldo) {
                            saldo -= saque;
                            System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", saldo);
                        } else {
                            System.out.println("Saldo insuficiente para realizar o saque.");
                        }
                        break;
                    case 4:
                        System.out.println("Encerrando o programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (escolha != 4);

        scanner.close();
    }

}

}
