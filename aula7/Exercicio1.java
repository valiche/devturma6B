import java.util.Stack;

public class Exercicio1 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        String frase = "ESTE EXERCICIO E MUITO FACIL";
        Character letra[] = new Character[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            letra[i] = frase.charAt(i);
            pilha.push(letra[i]);
        }
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        // simplificando
        System.out.println();
        String frase2 = "LICAF OTIUM E OICICREXE ETSE";
        for (int i = 0; i < frase2.length(); i++) {
            pilha.push(frase2.charAt(i));
        }
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }

        // ou ainda
        System.out.println();
        String frase3 = "ESTE EXERCICIO E MUITO FACIL";
        char letra3[] = frase3.toCharArray(); //converte String em vetor
        for (char c : letra3) { //para cada letra do vetor
            pilha.push(c);
        }
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
    }

}