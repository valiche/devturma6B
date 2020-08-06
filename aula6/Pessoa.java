public class Pessoa {
    private String nome, end, tel;

    // para evitar sobrecarga, criamos métodos similares com parâmetros diferentes

   public Pessoa() { // construtor default
        this.nome = "Não cadastrado";
        this.end = "Não cadastrado";
        this.tel = "Não cadastrado";
    }

    public Pessoa(String nome, String end, String tel ) { // construtor com parâmetro
        this.nome = nome;
        this.end = end;
        this.tel = tel;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEnd(){
        return end;
    }

    public void setEnd(String end){
        this.end = end;
    }

    public String getTel(){
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    protected String exibirDados(){
        return nome + " | " + end + " | " + tel;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return exibirDados();
    }
}