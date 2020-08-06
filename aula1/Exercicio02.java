import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner nota = new Scanner (System.in);
        String entrada;
        float nota1;
        float nota2;
        System.out.println("Digite a nota da P1: ");
        entrada = nota.nextLine();
        nota1 = Float.parseFloat(entrada);
        System.out.println("Digite a nota da P2: ");
        entrada = nota.nextLine();
        nota2 = Float.parseFloat(entrada);
        float media = (nota1 + nota2)/2;
        System.out.println("A média é: " + media);
        nota.close();

        float teste = ((15+2)/3f);
        System.out.println(teste);
    }
}