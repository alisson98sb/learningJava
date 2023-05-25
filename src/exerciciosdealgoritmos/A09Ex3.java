package exerciciosdealgoritmos;
/*
    3–Fazer um programa que leia o valor de um livro e o curso que o aluno frequenta
        .Se o aluno for do 1 ou do 2 ano dar um desconto de 15%, mas se o aluno for do 3ano, dar um desconto de 22%.
        Mostre o valor a pagar.
*/
import java.util.Scanner;

public class A09Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vlr;
        String course;
        int schoolYear;

        System.out.println("Digite o nome do curso que você está fazendo:");
        course = scanner.nextLine();

        System.out.println("Informe o ano letivo em que se encontra:");
        schoolYear = scanner.nextInt();

        System.out.println("Digite o valor do livro:");
        vlr = scanner.nextFloat();

        if (schoolYear == 1 || schoolYear == 2) {
            vlr -= vlr * 0.15;
        } else if (schoolYear == 3) {
            vlr -= vlr * 0.22;
        }

        System.out.println("Curso do cliente: " + course);
        System.out.println("Ano letivo do cliente: " + schoolYear);
        System.out.println("Valor a pagar: " + vlr);
    }
}
