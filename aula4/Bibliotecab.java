import java.util.Scanner;

public class Bibliotecab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Busque pelo título do livro:");
        String titulo = in.nextLine();
        Livro livro = new Livro(titulo, "Gama", "Emerson", 450);
        // livro.disponivel = false; //para testar else
        //livro.dados();
        livro.getDados(); //alteramos o método para return, simulando qdo temos um front diferente
        System.out.println(livro.getDados());
        /*
         System.out.println("Informe o título do livro  a ser cadastrado:"); titulo =
         in.nextLine(); Livro livro2 = new Livro(titulo, "ABC", "Paduan", 120);
         livro2.dados();
         */
        if (livro.consultar()) {
            System.out.printf("\nLivro '%s' está disponível.\n", livro.titulo);
            System.out.println("\nDigite 1 para emprestar");
            num = in.nextInt();
            if (num == 1) {
                livro.emprestar();
                System.out.printf("\nLivro '%s' emprestado.", livro.titulo);
            } else {
                System.out.println("Fim do programa!");
            }

        } else {
            System.out.printf("\nLivro: '%s' indisponível.\n", livro.titulo);
            System.out.println("Digite 0 para devolver");
            num = in.nextInt();
            if (num == 0) {
                livro.devolver();
                livro.consultar();
                System.out.println(livro.disponivel);
            } else {
                System.out.println("Fim do programa!");
            }
        }

        in.close();
    }
}