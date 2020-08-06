public class Sample04 {
    public static void main(String[] args) {
        // conversão de tipos de dados
        int numeroint;
        float numerofloat;
        numeroint = 230;
        numerofloat = numeroint; // um int cabe num float
        System.out.println(numeroint + "\n" + numerofloat);
        //numeroint = numerofloat; //um float não cabe num int, pq float > int
        numerofloat = 7.999f;
        numeroint = (int)numerofloat; //casting: faz a conversão, podendo perder informação
        System.out.println(numeroint); //não tem arredondamento
    }
}