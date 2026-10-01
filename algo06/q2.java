package algo06;
import java.util.Scanner;

public class q3 {
    /*Cálculo de multa por excesso de velocidade
    Uma empresa de trânsito deseja desenvolver um algoritmo para calcular a multa de um motorista que 
    ultrapassou a velocidade máxima permitida em uma determinada via.
    O programa deverá receber:
    A velocidade máxima permitida na via, em km/h;
    A velocidade registrada pelo radar, em km/h;
    O valor da multa normal, em reais.
    Primeiramente, o programa deverá calcular qual foi o percentual de excesso de velocidade cometido pelo 
    motorista.
    A multa será calculada de acordo com as seguintes faixas:
    Até 5% acima da velocidade permitida → multa normal;
    Acima de 5% até 10% → multa normal + R$ 100,00;
    Acima de 10% até 20% → multa normal + R$ 200,00;
    Acima de 20% até 30% → multa normal + R$ 300,00;
    Acima de 30% → multa normal + R$ 500,00.
    Caso a velocidade registrada seja igual ou inferior à velocidade permitida, o motorista não receberá multa.
    Ao final, o programa deverá informar:
    A velocidade permitida;
    A velocidade registrada;
    O percentual de excesso de velocidade;
    O valor final da multa. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade máxima permitida (km/h): ");
        double velocidadeMaxima = scanner.nextDouble();

        System.out.print("Digite a velocidade registrada pelo radar (km/h): ");
        double velocidadeRegistrada = scanner.nextDouble();

        System.out.print("Digite o valor da multa normal (R$): ");
        double multaNormal = scanner.nextDouble();

        if (velocidadeRegistrada <= velocidadeMaxima) {
            System.out.println("O motorista não recebeu multa.");
        } else {
            double excessoPercentual = ((velocidadeRegistrada - velocidadeMaxima) / velocidadeMaxima) * 100;
            double valorMultaFinal = multaNormal;

            if (excessoPercentual > 5 && excessoPercentual <= 10) {
                valorMultaFinal += 100;
            } else if (excessoPercentual > 10 && excessoPercentual <= 20) {
                valorMultaFinal += 200;
            } else if (excessoPercentual > 20 && excessoPercentual <= 30) {
                valorMultaFinal += 300;
            } else if (excessoPercentual > 30) {
                valorMultaFinal += 500;
            }

            System.out.printf("Velocidade permitida: %.2f km/h%n", velocidadeMaxima);
            System.out.printf("Velocidade registrada: %.2f km/h%n", velocidadeRegistrada);
            System.out.printf("Percentual de excesso de velocidade: %.2f%%%n", excessoPercentual);
            System.out.printf("Valor final da multa: R$ %.2f%n", valorMultaFinal);
        }

        scanner.close();
    }
}