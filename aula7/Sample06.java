import java.util.ArrayList;

public class Sample06 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        // lista.add (4, 6); //não consegue pular posição
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
        lista.remove(1); // remove a posição
        lista.add(1, 5); // adiciona valor na posição
        lista.add(1, 2); // empurra valor
        for (Integer num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (Integer num : lista) {
            if (num == 5) {
                System.out.println("Achei o valor " + 5 + " na lista.");
                num++; //não retorna para lista
            }

        }
        System.out.println();
        for (Integer num : lista) {
            System.out.print(num + " ");
        }

        System.out.println();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == 5) {
                System.out.println("Achei o valor " + 5 + " na lista.");
                lista.set(i,6); //altera valor na lista
            }

        }
        System.out.println();
        for (Integer num : lista) {
            System.out.print(num + " ");
        }

    }
}