package exerciciosdealgoritmos;
// 4–Fazer um programa que acesse um número de 1 a 7 e informe o dia da semana correspondente.
import java.util.Scanner;

public class A09Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekDay;

        System.out.println("Digite um numero(de 1 a 7) para receber o dia da semana correspondente.");
        weekDay = scanner.nextInt();

        if (weekDay == 1){
            System.out.println("O dia " + weekDay + " é DOMINGO.");
        } else if (weekDay == 2){
            System.out.println("O dia " + weekDay + " é SEGUNDA-FEIRA.");
        } else if (weekDay == 3){
            System.out.println("O dia " + weekDay + " é TERÇA-FEIRA.");
        } else if (weekDay == 4){
            System.out.println("O dia " + weekDay + " é QUARTA-FEIRA.");
        } else if (weekDay == 5){
            System.out.println("O dia " + weekDay + " é QUINTA-FEIRA.");
        } else if (weekDay == 6){
            System.out.println("O dia " + weekDay + " é SEXTA-FEIRA.");
        } else if (weekDay == 7){
            System.out.println("O dia " + weekDay + " é SABABO.");
        } else {
            System.out.println("Númeoro inválido, tente novamente com um dígito de 1 a 7");
        }

    }
}
