import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario, consumo, customedio, conta;
       final float racional = (1.0f/500); //final significa valor fixa
        System.out.println("Salário mínimo: ");
        salario = entrada.nextFloat();
        System.out.println("Consumo (kW): ");
        consumo = entrada.nextFloat();
        customedio = salario*racional;
        conta = (customedio*consumo);
        System.out.println(customedio + "R$/kW\n" + conta + " R$ a pagar\n" + (1-0.15f)*conta + " R$ com desconto" );
        entrada.close();
    }
}