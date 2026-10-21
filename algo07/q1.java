package algo07;
import java.util.Scanner;

public class q1 {
    //Crie um metodo, que receba um parametro inteiro e mostre o resultado da tabuada do numero informado
    //usando um laço faça ate.
    public void mostrarTabuada(int num, int mult) {
        int i = 0;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= mult);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para mostrar a tabuada:");
        int num = scanner.nextInt();

        System.out.println("Digite até qual multiplicador deseja ver a tabuada:");
        int mult = scanner.nextInt();

        q1 tabuada = new q1();
        tabuada.mostrarTabuada(num, mult);
    }

}
