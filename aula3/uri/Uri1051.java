package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // IR Lisard, Rombus R$
        float salario, aliquota;
        final float p2 =0.08f, p3 = 0.18f, p4 = 0.28f, faixa1 = 2000, faixa2 = 3000, faixa3 = 4500;
        // System.out.println("Salário:");
        salario = in.nextFloat();
        aliquota = 0;
        if (salario <= faixa1 && salario > 0) {
            System.out.println("Isento");
        } else {
            if (salario > faixa1 && salario <= faixa2) {
                aliquota = (salario - faixa1) * p2;
            } else {
                if (salario > faixa2 && salario <= faixa3) {
                    aliquota = (faixa2 - faixa1) * p2 + (salario - faixa2) * p3;
                } else {
                    if (salario > faixa3) {
                        aliquota = (faixa2 - faixa1) * p2 + (faixa3 - faixa2) * p3 + (salario - faixa3) * p4;
                    }
                }
            }
            System.out.printf("R$ %.2f\n", aliquota);
            in.close();
        }
    }
}