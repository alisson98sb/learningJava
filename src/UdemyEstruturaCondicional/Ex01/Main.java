package UdemyEstruturaCondicional.Ex01;
/*
 *   Uma operadora de telefonia cobra R$50.00 por um plano básico que dá direito a 100 minutos de ligação.
 *       Cada minuto que exceder a franquia de 100 minutos custa R$2,00.
 *       Fazer um programa que leia a quantidade de minutos que uma pessoas consumiu e mostre o valor a ser pago.
 *
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vlr = 50.00;
        int min;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMinutos de ligação utilizado: \n");
        min = scanner.nextInt();

        if(min > 100) {
            vlr += (min - 100) * 2;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", vlr);
    }
}
