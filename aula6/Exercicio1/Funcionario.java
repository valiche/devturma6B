package Exercicio1;

public class Funcionario {
    private String nome;
    private float horas, valorh;

    public Funcionario(String nome, float horas, float valorh) {
        this.nome = nome;
        this.horas = horas;
        this.valorh = valorh;
    }

    public float getSalario() {
        return horas * valorh;
    }

    public String exibirDados(){
        return nome + " | Horas trabalhadas:  " + horas + " | Valor/hora: " + valorh;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getValorh() {
        return valorh;
    }

    public void setValorh(float valorh) {
        this.valorh = valorh;
    }

}