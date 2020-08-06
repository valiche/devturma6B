package JavaOO;

public class Carro {
    // abstração, define todas as propriedades da classe
    String marca, modelo, cor, combustivel;
    int km, ano;
    double preco;

    // calcular IPVA (funcionalidades, comportamentos ou métodos)
    void calcularipva() {
        if (ano < 2000) {
            System.out.println("Isento de IPVA.");
        } else {
            double ipva;
            ipva = preco * 0.04;
            System.out.printf("Valor do IPVA = R$ %.2f \n ", ipva);
        }
    }

}