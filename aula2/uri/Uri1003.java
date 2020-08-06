package uri;

import java.util.Scanner;

/**
 * Uri1003
 */
public class Uri1003 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int A, B, soma;
        A = entrada.nextInt();
        B = entrada.nextInt();
        soma = A + B;
        System.out.println("SOMA = " + soma);
        entrada.close();
    }
}