package class3;

import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("O número " + num1 + " foi o primeiro número digitado, e é maior que o segundo número " + num2);
        } else if(num1 < num2){
            System.out.println("O número " + num2 + " foi o segundo número digitado, e é maior que o primeiro número " + num1);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
