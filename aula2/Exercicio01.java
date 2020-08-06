import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inteiro;
        inteiro = entrada.nextInt();
        if (inteiro > 20) {
            float metade;
            metade = (float)inteiro/2;
            System.out.printf("Para números maiores que 20, a metade é: %.1f\n", metade);
        }
        entrada.close();
    }
}