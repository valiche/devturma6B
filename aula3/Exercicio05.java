import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, soma, seq;
        seq=1;
        num = 1;
        soma = 0;
        while (num != 0) {
            System.out.printf("Digite o %dº número: ", seq);
            num = in.nextInt();
            soma= soma + num;
            seq++;
        }
        in.close();
        System.out.printf("\nA soma dos valores é: %d", soma);
    }
}