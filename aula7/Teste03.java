import java.util.TreeSet;

public class Teste03 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        String num[] = {"Diego", "Isabele", "Carol", "Maria Carmen", "Pedro", "Bruno", "Tania", "Zé Junior"}; //letra minúscula vem depois

        for(String i : num){
            tree.add(i);
        }

        for (String i : tree){ //árvore ordena e percorre esquerda-"pai"-direita
            System.out.print(i + " ");
        }
    }
}