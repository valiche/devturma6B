package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
        valor = entrada.nextInt();
        if (valor < 1000000) {
            if (valor > 0) {
                nota100 = valor / 100;
                nota50 = (valor - (100 * nota100)) / 50;
                nota20 = (valor - (100 * nota100 + 50 * nota50)) / 20;
                nota10 = (valor - (100 * nota100 + 50 * nota50 + 20 * nota20)) / 10;
                nota5 = (valor - (100 * nota100 + 50 * nota50 + 20 * nota20 + 10 * nota10)) / 5;
                nota2 = (valor - (100 * nota100 + 50 * nota50 + 20 * nota20 + 10 * nota10 + 5 * nota5)) / 2;
                nota1 = (valor - (100 * nota100 + 50 * nota50 + 20 * nota20 + 10 * nota10 + 5 * nota5 + 2 * nota2));
                System.out.println(valor + "\n" + nota100 + " nota(s) de R$ 100,00\n" + nota50 + " nota(s) de R$ 50,00\n" + nota20
                        + " nota(s) de R$ 20,00\n" + nota10 + " nota(s) de R$ 10,00\n" + nota5 + " nota(s) de R$ 5,00\n"
                        + nota2 + " nota(s) de R$ 2,00\n" + nota1 + " nota(s) de R$ 1,00");
            }
        }
        entrada.close();
    }

}