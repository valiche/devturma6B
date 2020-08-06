package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario, reajuste, percentual;
        final float p4 = 4, p7 = 7, p10 = 10, p12 = 12, p15 = 15;
        System.out.println("Salário:");
        salario = in.nextFloat();
        percentual = 0;
        if (salario > 2000) {
            percentual = p4;
        } else {
            if (salario <= 2000 && salario > 1200) {
                percentual = p7;
            } else {
                if (salario <= 1200 && salario > 800) {
                    percentual = p10;
                } else {
                    if (salario <= 800 && salario > 400) {
                        percentual = p12;
                    } else {
                        if (salario <= 400 && salario > 0) {
                            percentual = p15;
                        }
                    }
                }
            }
        }
        reajuste = salario * percentual / 100;
        salario = salario + reajuste;
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %%\n", salario, reajuste,
                percentual);
        in.close();
    }

}