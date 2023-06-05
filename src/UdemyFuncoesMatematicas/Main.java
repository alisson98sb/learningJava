package UdemyFuncoesMatematicas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *       Math.sqrt(x)    => Raiz quadrada de x
                Math.pow(x,y)   => x elevado a y
                Math.abs(x)     => Valor absoluto de x
         */
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25);

        System.out.println("A raíz quadrada de " + x + "= " + A);
        System.out.println("A raíz quadrada de " + y + "= " + B);
        System.out.println("A raíz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + "Elevado a " + y + "= " + A);
        System.out.println(x + "Elevado a " + 2 + "= " + B);
        System.out.println(5.0 + "Elevado a " + 2.0 + "= " + C);

        B = Math.abs(y);
        C = Math.abs(z);

        System.out.println("O valor absoluto de " + y + "= " + B);
        System.out.println("O valor absoluto de " + z + "= " + C);

    }
}
