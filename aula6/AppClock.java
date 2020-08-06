public class AppClock {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(05,10);
    System.out.println(relogio.getTime());
    Relogio relogio2 = new Relogio();
    System.out.println(relogio2.getTime());
    }
}