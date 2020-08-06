public class Professor extends Pessoa {
    private String titulo, instituicao;
    private float salario;

    public Professor(){
        titulo = "Não cadastrado";
        instituicao = "Não cadastrado";
        salario = 0.0f;
    }
//OU
    public Professor (String nome, String end, String tel, String titulo, String instituicao, float salario){
        super(nome, end, tel);
        this.titulo = titulo;
        this.instituicao = instituicao;
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override //Sobreposição
    public String exibirDados(){
        return titulo + " " + super.exibirDados();
        }

    
}