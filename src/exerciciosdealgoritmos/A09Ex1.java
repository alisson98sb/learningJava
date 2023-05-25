package exerciciosdealgoritmos;

import java.util.Scanner;

/*
*  1–Fazer um programa que leia a média final e a frequência do aluno.
*    Se a média final for maior ou igual a 7 E a frequência for maior ou
*    igual a 75,mostrar mensagem "aluno aprovado", Caso contrário "aluno reprovado".
*/
public class A09Ex1 {
    public static void main(String[] args) {
        int mf, freq;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a média final:");
        mf = scanner.nextInt();

        System.out.println("Digite a frequência do aluno:");
        freq = scanner.nextInt();

        if (mf < 7 || freq < 75) {
            System.out.println("Aluno Reprovado!");
        } else {
            System.out.println("Aluno Aprovado!");
        }


    }
}
