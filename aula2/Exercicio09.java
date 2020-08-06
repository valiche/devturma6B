import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Coloque as 4 notas:");
        float nota1, nota2, nota3, nota4, media, exame;
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        nota4 = entrada.nextFloat();
        System.out.println("Coloque as faltas:");
        int faltas;
        faltas = entrada.nextInt();
        if (faltas < 16) { // só calcula a média se não reprovar por falta
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            if (media >= 6.0) {
                System.out.println("Aprovado. Média: " + media);
            } else {
                System.out.println("Nota do exame:");
                exame = entrada.nextFloat();
                media = (media + exame)/2;
                if (media >= 5.0) {
                    System.out.println("Aprovado. Média: " + media);
                } else {
                    System.out.println("Reprovado. Média: " + media);
                }
            }
            entrada.close();
        } else {
            System.out.println("Reprovado por faltas.");
        }

    }
}