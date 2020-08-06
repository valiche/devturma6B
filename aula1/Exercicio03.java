import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        /*String entrada;
        float salarioup;
        System.out.println("Salário atual:");
        entrada = salario.nextLine();
        salarioup = Float.parseFloat(entrada);
        System.out.println("Salário futuro: " + salarioup*1.25);
        */
        
        String entrada;
        float salarioup; //ou usar double, consome dobro de espaço, mas traz mais precisão
        System.out.println("Salário atual:");
        entrada = salario.nextLine();
        salarioup = (Float.parseFloat(entrada) * 1.25f); //java interpreta 1.25 como double, colocar o f para entender que é float
        System.out.println("Salário futuro: " + salarioup);
    
        salario.close();
    }
}