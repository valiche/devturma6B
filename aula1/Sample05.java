import java.util.Scanner;

public class Sample05 {
    public static void main(String[] args) {
        // entrada de dados
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        System.out.println("Bem-vindo(a), " + nome);
        System.out.println("Deseja sair? (S-SIM/ N-NÃO)");
        entrada.close();
    }
}