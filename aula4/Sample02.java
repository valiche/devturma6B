public class Sample02 {
    public static void main(String[] args) {
        //metodos com ou sem parâmetros
        linha();
        linha2('_');
        linha3('*',18);

    }

    public static void linha() {
        System.out.println("------");
    }

    public static void linha2(char simbolo) { //com parâmetro
        for (int i = 0; i <= 6; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }
    public static void linha3(char simbolo, int tamanho) {
        for (int i = 0; i <= tamanho; i++) {
            System.out.print(simbolo);
        }
    }
}