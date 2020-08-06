package JavaOO;

public class WebiMotors {
    public static void main(String[] args) {
        Carrob c, c2; //variavel tipo carro que vai trazer todas aquelas propriedades
        c = new Carrob();
        c.marca= "Fiat";
        c.modelo= "Uno";
        c.ano= 1990;
        c.cor= "Branco";
        c.km= 320000;
        c.combustivel= "Gasolina";
        c.preco=  5300;
        
        c2 = new Carrob();
        c2.marca= "Chevrolet";
        c2.modelo= "Corsa";
        c2.ano= 2003;
        c2.cor= "Vinho";
        c2.km= 180000;
        c2.combustivel= "Alcool";
        c2.preco=  8962.45;

        System.out.println("Carro = "+ c2.marca +"/ " + c2.modelo);
        System.out.println("R$ " + c2.preco);
        //c2.calcularipva(); //usado com Carro anteriormente
        double imp2 = c2.calcularipva();
        System.out.println("IPVA = R$ " + imp2);

    }
}