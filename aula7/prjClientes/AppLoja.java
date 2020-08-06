package prjClientes;

public class AppLoja {
    public static void main(String[] args) {
        Dependente anad = new Dependente("Andre", "andre@a");
        Cliente ana = new Cliente("Ana", "ana@a", anad);
        Cliente beto = new ClienteVip("Beto", "beto@b", "Bruno", "bruno@b");
        Cliente carlos = new Cliente("Carlos", "carlos@c");

        ana.colocarCredito(150);
        if (ana.fazerCompra(200)) {
            System.out.println("Compra feita com sucesso.");
        } else {
            System.out.println("Compra não realizada | Saldo restante: " + ana.getCredito());
        }
        ClienteVip.setCredEsp(100);
        if (beto.fazerCompra(250)) {
            System.out.println("Compra feita com sucesso.");
        } else {
            System.out.println("Compra não realizada | Saldo com limite: " + beto.getCredito());
        }

        System.out.println(ana);
        System.out.println(beto);
        System.out.println(carlos);

    }
}