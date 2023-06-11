package UdemyEstruturaCondicional.ExSwitchCase;
/*
    Fazer um programa para ler o valor inteiro de 1 a 7 representando um dia da semana (sendo 1 = domingo).
    Escrevar na tela o dia da semana correspondente.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        String weekDay;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dígito de 1 a 7");

        day = scanner.nextInt();

        switch (day) {
            case 1:
                weekDay = "Domingo";
                break;
            case 2:
                weekDay = "Segunda";
                break;
            case 3:
                weekDay = "Terça";
                break;
            case 4:
                weekDay = "Quarta";
                break;
            case 5:
                weekDay = "Quinta";
                break;
            case 6:
                weekDay = "Sexta";
                break;
            case 7:
                weekDay = "Sabado";
                break;
            default:
                weekDay = "Valor inválido";
                break;
        }
        System.out.println("Dia da semana: " + weekDay);
        //System.out.printf("Dia da semana: %s", weekDay);
    }
}
