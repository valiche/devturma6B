import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario;
        System.out.println("Digite o salário:");
        salario = entrada.nextFloat();
        if (salario > 600) {
            if (salario <= 1200) {
                System.out.println("Desconto INSS: 20%");
            } else {
                if (salario <= 2000) {
                    System.out.println("Desconto INSS: 25%");
                } else {
                    System.out.println("Desconto INSS: 30%");
                }
            }
        } else {
            System.out.println("Isento");
        }
        entrada.close();
    }
}
