import java.util.Scanner;
import java.util.Stack;

public class Teste01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();
        System.out.println("Qual frase?");
        String frase = in.nextLine();
        char letra[] = frase.toCharArray();
        for (char c : letra){
            pilha.push(c);
        }
       while(!pilha.isEmpty()){
           System.out.print(pilha.pop());
       }
        in.close();
    }
}