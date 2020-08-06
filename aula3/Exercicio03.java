import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont;
        System.out.println("Número:");
        num = in.nextInt();
        cont=1;
        while (cont <= num){
            System.out.printf("%d, ", cont);
            cont = cont*2;
        }
        in.close();
    }
}