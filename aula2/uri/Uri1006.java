package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, media;
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        media = (2*a+3*b+5*c)/10;
        System.out.printf("MEDIA = %.1f\n", media); // %s = string, %d = double; %f = float
        entrada.close();
    }
}