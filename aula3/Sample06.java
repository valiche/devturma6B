import java.util.Scanner;

public class Sample06 {
    public static void main(String[] args) {
        int cont, inicio;
        cont=1;
        for(cont=1;cont<3;cont++){
            System.out.println(cont);
        } 
        Scanner in = new Scanner(System.in);
        System.out.println("Inicial:");
        inicio = in.nextInt();
        in.close();
        for(;inicio<5;inicio++){
            System.out.println(inicio);
        }
    }
}