package Exercicio1;

public class FSenior extends Funcionario {
    float bonus;

    public FSenior(String nome, float horas, float valorh, float bonus) {
        super(nome, horas, valorh);
        this.bonus = bonus;
    }

    public float getSalario() {
        return super.getSalario() + (bonus * getHoras()/10); //pq horas está privado
    }

    public String exibirDados() {
        return super.exibirDados() + " | Bônus: " + bonus;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.exibirDados()+ " | Bônus: " + bonus;

    }

}