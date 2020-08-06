package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int codigo1, quantidade1, codigo2, quantidade2;
        float unitario1, unitario2, valort;
        codigo1 = entrada.nextInt();
        quantidade1 = entrada.nextInt();
        unitario1 = entrada.nextFloat();
        codigo2 = entrada.nextInt();
        quantidade2 = entrada.nextInt();
        unitario2 = entrada.nextFloat();
        valort = quantidade1*unitario1 + quantidade2*unitario2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", valort);
        entrada.close();
    }
}