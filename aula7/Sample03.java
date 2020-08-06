import java.util.TreeSet;

public class Sample03 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        int num[] = {2, 4, 1, 6, 3, 7, 9, 5};

        for(Integer i : num){
            tree.add(i);
        }

        for (int i : tree){ //árvore ordena e percorre esquerda-"pai"-direita
            System.out.print(i + " ");
        }
    }
}