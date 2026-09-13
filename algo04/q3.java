package algo04;
import java.util.Scanner;

public class q3 {
    //Faça um programa em java e seu respectivo fluxograma que dada 2 notas (p1 e p2)
    //e a quantidade de faltas, calcule a media e verifique se a media e maior igual 
    //a seis e a quantidade de faltas <= 20 caso verdadeiro mostre aluno aprovado e
    //mostre o valor da media, caso negativo mostre a mensagem aluno reprovado e qual
    //a nota sera necessario tirar para ser aprovado no exame

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p1, p2, p3, media;
        int F, FEx;
        
        System.out.println("Digite a nota da P1:");
        p1 = scanner.nextDouble();

        System.out.println("Digite a nota da P2:");
        p2 = scanner.nextDouble();

        System.out.println("Digite a quantidade de faltas:");
        F = scanner.nextInt();

        media = (p1 + p2) / 2;

        if (media >= 6 && F <= 20) {
            System.out.printf("Aluno aprovado com média: %.2f%n", media);
        } else {
            if (F > 20) {
                FEx = F - 20;
                System.out.printf("Aluno reprovado por faltas. Faltas excedentes: %d%n", FEx);
            } else {
                p3 = 18 - (p1 + p2);
                System.out.printf("Aluno reprovado. Nota necessária para passar no exame: %.2f%n", p3);
            }
        }
    }
}
