import java.util.Scanner;

public class Appbookmenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecione o título do livro:");
        String titulo = in.nextLine();
        Ebook book1 = new Ebook(titulo, "Isabele", 100, 0, 99);
        System.out.println(
                "O que deseja fazer?\n 1-Selecionar página; 2- Avançar página; 3- Voltar página; 4- Ver a capa; 0- Sair");
        int op = in.nextInt();
        if (op == 1) {
            book1.Irpag();
            System.out.println(book1.getInfo());
        } else {
            if (op == 2) {
                book1.avancarpag();
                System.out.println(book1.getInfo());
            } else {
                if (op == 3) {
                    book1.retrocederpag();
                    System.out.println(book1.getInfo());
                } else {
                    if (op == 4) {
                        book1.Capa();
                        System.out.println(book1.getInfo());
                    } else {
                        System.out.println("Opção inválida.");
                    }
                }
            }
        }

        in.close();
    }
}