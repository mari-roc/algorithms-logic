package algo07;
import java.util.Scanner;

public class q2 {
    //Crie um metodo que receba um numero inteiro, utilize um laço faça enquanto e pergunte para o usuario 
    //chutar um segundo numero, se o segundo chutado for menor que o parametro informado mostre a mensagem 
    //E MENOR e repita o laço,  se o segundo chutado for maior que o parametro informado mostre a mensagem 
    //E MAIOR e repita o laço, se for igual mostre a mensagem E IGUAL e interrompa o laço.

    public void adivinharNumero(int num) {
        Scanner scanner = new Scanner(System.in);
        int chute;
        
        do {
            System.out.println("Chute um número:");
            chute = scanner.nextInt();

            if (chute < num) {
                System.out.println("E MENOR");
            } else if (chute > num) {
                System.out.println("E MAIOR");
            }
        } while (chute != num);

        System.out.println("E IGUAL");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para adivinhar:");
        int num = scanner.nextInt();

        q2 jogo = new q2();
        jogo.adivinharNumero(num);
    }
}
