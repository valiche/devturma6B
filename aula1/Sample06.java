import java.util.Scanner;

public class Sample06 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int idade;
      System.out.println("Digite sua idade:");
      idade = entrada.nextInt();
      System.out.println("Você tem " + idade + " anos."); 
      float peso; //responder com ","
      System.out.println("Digite seu peso:");
      peso = entrada.nextFloat();
      System.out.println("Você tem " + peso + " quilos. Para " + idade + " anos."); 
      entrada.close();
    }
}