import java.util.Scanner;

public class AppBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecione o título do livro:");
        String titulo = in.nextLine();
        System.out.println("Qual página inciar:");
        int pagatual = in.nextInt();
        Ebook book1 = new Ebook(titulo, "Isabele", 100, pagatual, 99);
        System.out.println("Avaçar página.");
        book1.avancarpag();
        System.out.println(book1.getInfo());
        System.out.println("Selecionar página:");
        book1.Irpag();
        System.out.println(book1.getInfo());
        System.out.println("Voltar página.");
        book1.retrocederpag();
        System.out.println(book1.getInfo());
        System.out.println("Ver Capa");
        book1.Capa();
        System.out.println(book1.getInfo());

        in.close();
    }
}