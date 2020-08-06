import java.util.Scanner;

public class Exercicio03b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont;
        System.out.println("Número:");
        num = in.nextInt();
        cont=1;
        System.out.print(cont);
        cont=cont*2;
        while (cont <= num && cont>1){
            System.out.printf(", %d", cont);
            cont = cont*2;
        }
        in.close();
    }
}