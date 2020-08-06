import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont, num, soma = 0, pos = 0;
        float media=0, per=0;
        in.close();
        for (cont = 0; cont < 10; cont++) {
            num = in.nextInt();
            soma = soma + num;
            if (num > 0) {
                pos++;
            }
        }
        media = (float) soma/cont;
        per = (float) pos*100/cont;
        System.out.printf("Soma = %d\nQtde Positivos: %d\nMédia = %.2f\n %.0f%% positivos.", soma, pos, media, per);
    }
}