import java.util.Scanner;

public class Ebook {
    String titulo, autor;
    int tpag, pagatual, zoom;

    public Ebook(String titulo, String autor, int tpag, int pagatual, int zoom) {
        this.titulo = titulo;
        this.autor = autor;
        this.tpag = tpag;
        this.pagatual = pagatual;
        this.zoom = zoom;
    }

    public void avancarpag() {
        if (pagatual < tpag) {
            pagatual++;
        } else {
            System.out.println("Essa é a última página");
        }
    }

    public void retrocederpag() {
        if (pagatual > 1) {
            pagatual--;
        } else {
            System.out.println("Você está na capa. Não é possível retornar.");
        }
    }

    public void Irpag() {
            Scanner in = new Scanner(System.in);
            System.out.println("Qual a página?");
            int pagnew = in.nextInt();
            in.close();
            if (pagnew <0 || pagnew> tpag){
                System.out.println("Página não existe.");
            }else{
                pagatual=pagnew;
            }
    }

    public void Capa() {
        pagatual=0;
    }

    public String getInfo() {
        if(pagatual==0){
            return "Capa | " + tpag + " páginas restantes\n" + titulo + " | " + autor;
        }
        return "Página:" + pagatual + " de " + tpag + "\n" + titulo + " | " + autor;
    }
}