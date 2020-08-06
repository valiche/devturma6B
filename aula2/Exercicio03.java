import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2;
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        if (n2 >= n1) { //para diferente, usar !=
            System.out.println("Ordem não crescente: " + n2 + " e " + n1);
        } else {
            System.out.println("Ordem não crescente: " + n1 + " e " + n2);
        }
        entrada.close();
    }
}