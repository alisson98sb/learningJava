package UdemyEstruturaCondicional.ExIfTernario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        String verificador;


        System.out.println("Informe um valor para A: ");
        a = scanner.nextInt();

        System.out.println("Informe um valor para B: ");
        b = scanner.nextInt();

        verificador = (a > b) ? "Sim" : "Não";

        System.out.println(a + " é maior que " + b + " ? \n" + verificador);
    }
}
