package algo06;
import java.util.Scanner;

public class q1 {
    /*Campeonato de Atletismo, Uma escola de atletismo deseja inscrever seus alunos em uma competição. 
    Para definir a categoria de cada atleta, o programa deverá receber a idade do aluno.
    As categorias são:
    De 0 a 5 anos: não pode competir
    De 6 a 8 anos: Pré-mirim
    De 9 a 11 anos: Mirim
    De 12 a 14 anos: Infantil
    De 15 a 17 anos: Juvenil
    De 18 a 39 anos: Adulto
    De 40 a 49 anos: Master 1
    De 50 a 59 anos: Master 2
    60 anos ou mais: Master 3
    O programa deverá informar a categoria do atleta ou informar que ele não pode competir.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do atleta: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida.");
        } else if (idade <= 5) {
            System.out.println("Não pode competir.");
        } else if (idade <= 8) {
            System.out.println("Categoria: Pré-mirim");
        } else if (idade <= 11) {
            System.out.println("Categoria: Mirim");
        } else if (idade <= 14) {
            System.out.println("Categoria: Infantil");
        } else if (idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else if (idade <= 39) {
            System.out.println("Categoria: Adulto");
        } else if (idade <= 49) {
            System.out.println("Categoria: Master 1");
        } else if (idade <= 59) {
            System.out.println("Categoria: Master 2");
        } else {
            System.out.println("Categoria: Master 3");
        }

        scanner.close();
    }
}
