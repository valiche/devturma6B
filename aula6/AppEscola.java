public class AppEscola {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Isabele", "Mi Casa", "5555-5555", 987266071, "Java", 2020);
        //Estudante estudante2 = new Estudante(987267, "DEV", 2022);
        // System.out.println("Estudante: " + estudante.getNome() + " | RA: " +
        // estudante.getRa());
        Professor professor = new Professor("Emerson", "Su Casa", "5555-0000", "Prof", "Gama", 100000);
        // System.out.println("Professor: " + professor.getNome() + " | Salário: " +
        // professor.getSalario());
        System.out.println(estudante.exibirDados());
        System.out.println(professor.exibirDados());

        System.out.println(professor); //usando o toString
    }
}