import java.util.Scanner;

public class Exercicio05b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha, senhaconf;
        senha = entrada.nextLine();
        System.out.println("Confirme a senha:");
        senhaconf = entrada.nextLine();       
        if (senha.equals(senhaconf)) {
            System.out.println("Senha criada.");
        } else {
            System.out.println("As senhas não conferem.");
        }
        entrada.close();
    }
}