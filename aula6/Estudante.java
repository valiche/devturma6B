public class Estudante extends Pessoa {
   private int ra, anofim;
   private String curso;

    public Estudante(int ra, String curso, int anofim){
        this.ra = ra;
        this.curso = curso;
        this.anofim = anofim;
    }
//OU
    public Estudante(String nome, String end, String tel, int ra, String curso, int anofim){
       super(nome, end, tel);
        this.ra = ra;
        this.curso = curso;
        this.anofim = anofim;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getAnofim() {
        return anofim;
    }

    public void setAnofim(int anofim) {
        this.anofim = anofim;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String exibirDados(){
        return super.exibirDados() + " | RA: " + ra;
    }


}