import java.util.Scanner;

public class Exercico04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, par, impar, dig;
        num = 0;
        par = 0;
        impar = 0;
        dig = 1;
        while (dig <= 10) {
            System.out.printf("Digite o %dº número: ", dig);
            num = in.nextInt();
            dig++;
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        in.close();
        System.out.printf("\nO total de pares é: %d", par);
        System.out.printf("\nO total de ímpares é: %d", impar);
    }
}