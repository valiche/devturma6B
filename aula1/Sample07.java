import java.util.Scanner;

public class Sample07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String digitado;
        int idade;
        float peso;
        String nome;
        System.out.println("Digite sua idade:");
        digitado = entrada.nextLine(); //leio como texto
        idade = Integer.parseInt(digitado); // converto
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine(); //se a variável int vier antes, dá erro. Podemos fazer 2 Scanner, começar sempre por texto ou converter
        System.out.println("Digite seu peso (ex. 70.6):"); //usamos ponto para a conversão dentro do java
        digitado = entrada.nextLine();
        peso = Float.parseFloat(digitado);
        System.out.println("Olá, " + nome + ", sua idade é: " + idade + " e seu peso é: " + peso +"!");
        entrada.close();
    }
}