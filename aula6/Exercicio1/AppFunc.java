package Exercicio1;

public class AppFunc {
    public static void main(String[] args) {
        Funcionario isabele = new Funcionario("Isabele", 40, 50);
        System.out.println("Salário: " + isabele.getSalario());
        System.out.println(isabele.exibirDados());
        FSenior emerson = new FSenior("Emerson", 48, 500, 1000);
        System.out.println("Salário: " + emerson.getSalario());
        System.out.println(emerson);
    }
}