package exerciciosdealgoritmos;
/*
* 2–Acessar idade e sexo de uma pessoa (digitar 1 para masculino e 2 para feminino) e verificar se a pessoa
pode fazer o alistamento militar.
* */
import java.util.Scanner;

public class A09Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, sex;

        System.out.println("Seu gênero é: \n [1] - Masculino.\n [2] - Feminino.");
        sex = scanner.nextInt();

        System.out.println("Informe sua idade:");
        age = scanner.nextInt();

        if (age == 18 && sex == 1) {
            System.out.println("Você está apto ao alistamento militar!");
        } else {
            System.out.println("Você não está apto ao alistamento militar!");
        }
    }
}
