import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, media;
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        media = (nota1 * 0.4f + nota2 * 0.6f);
        if (media >= 6.0) {
            System.out.println("Aprovado. Média: " + media);
        } else {
            if (media >= 3.0) {
                System.out.printf("Exame. Precisa de %.2f", ((6-0.5f*media)/0.5f));
            } else {
                System.out.println("Reprovado. Média: " + media);
            }
        }
        entrada.close();
    }
}