package JavaOO;

public class Carrob {
    String marca, modelo, cor, combustivel;
    int km, ano;
    double preco;

    // calcular IPVA (funcionalidades, comportamentos ou métodos)
    double calcularipva() {
        double valoripva;
        if (ano < 2000) {
            valoripva = 0;
        } else {
            valoripva = preco * 0.04;
        }
        return valoripva; //sempre que tem um tipo, ele deve retornar
    }
}