import java.util.Scanner;

/**
 * Exercicio4
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota[] = new double[6];
        double media = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            nota[i] = in.nextDouble();
            media = media + nota[i];
        }

        for (int i = 0; i < nota.length; i++) {
            System.out.print((i+1) + "ª Nota: " + nota[i] + " | ");
        }

        media = media / nota.length;
        System.out.println("\nA média da turma foi: " + media);

        int cont = 0;
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > media) {
                cont++;
            }
        }
        System.out.println("A turma teve " + cont + " notas acima da média.");
        in.close();
    }
}