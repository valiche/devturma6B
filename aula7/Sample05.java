import java.util.Hashtable;

public class Sample05 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hash = new Hashtable<>();

        hash.put(1, "UM");
        hash.put(2, "DOIS");
        hash.put(3, "TRÊS");

        System.out.println("Digite valor de 1 a 9: ");
        int num = 2;

        System.out.println(hash.get(num));

    }
}