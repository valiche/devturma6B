import java.util.Stack;

public class Sample01 {
    public static void main(String[] args) {
        //Estrutura de Objetos: Pilha (FILO) - tipo único de dados
        
        Stack<Integer> pilha = new Stack<>(); // integer é a classe de inteiros
        pilha.push(1); //inserir (inteiro)
        pilha.push(2);
        pilha.push(3);
        System.out.println(pilha.size()); //qtde de elementos
        while(!pilha.isEmpty()){ //verificar se está vazia
            System.out.println(pilha.pop()); //tirar elemento, segue a ordem
        }
    }
}