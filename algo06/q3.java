package algo06;
import java.util.Scanner;

public class q3 {
    /*Simulador de Caixa Eletrônico
    Crie um programa que simule as operações básicas de um caixa eletrônico.
    Ao iniciar o programa, o usuário deverá informar o valor do depósito inicial da sua conta.
    Em seguida, deverá ser apresentado um menu com as seguintes opções:
    1 — Consultar saldo
    2 — Depositar
    3 — Sacar
    4 — Sair
    O programa deverá utilizar o comando escolha para identificar a opção escolhida pelo usuário.
    Regras
    Na opção 1, o programa deverá mostrar o saldo atual da conta.
    Na opção 2, o usuário deverá informar o valor que deseja depositar. O valor deverá ser acrescentado ao
    saldo.
    Na opção 3, o usuário deverá informar o valor que deseja sacar.
    Se o valor solicitado for menor ou igual ao saldo disponível, o saque deverá ser realizado e o valor
    deverá ser descontado do saldo.
    Caso o valor solicitado seja maior que o saldo disponível, o programa deverá informar que não há saldo
    suficiente e não realizar o saque.
    Na opção 4, o programa deverá encerrar a execução.
    Caso o usuário informe uma opção que não existe no menu, o programa deverá apresentar uma mensagem de
    opção inválida. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito inicial: ");
        double saldo = scanner.nextDouble();

        int escolha;
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
