import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, fator, produto;
        System.out.println("Número:");
        num = in.nextInt();
        fator = 1;
        while (fator <= 10) {
            produto = num * fator;
            // System.out.println(num + " * " +fator + " = "+ produto);
            System.out.printf("%d * %d = %d\n", num, fator, produto);
            fator++;
        }
        in.close();

    }
}