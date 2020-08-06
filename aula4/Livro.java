public class Livro {
    String titulo, autor, editora;
    int ano, pag;
    boolean disponivel;

    // metodo construtor para iniciar os atributos, com o mesmo nome da classe
    public Livro(String titulo, String editora, String autor, int pag) {
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.pag = pag;
        this.disponivel = true;
    }

    public void dados(){
        String estoque;
        if (disponivel){
            estoque = "(está disponível)";
        }else{
            estoque = "(indisponível no momento)";
        }
        System.out.printf("\nTítulo: %s %s\nEditora: %s\nAutor(a): %s\nNúmero de páginas: %d\n", titulo, estoque, editora, autor, pag);
    }
    
    public String getDados(){
        String estoque;
        if (disponivel){
            estoque = "(está disponível)";
        }else{
            estoque = "(indisponível no momento)";
        }
        return "Título: " + titulo + " | Editora:" + editora + " | Autor(a):" + autor + " | Número de páginas: " + pag + " | " + estoque;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }

    public boolean consultar() {
        return disponivel;
    }
}