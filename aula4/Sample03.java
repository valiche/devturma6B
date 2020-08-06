public class Sample03 {
    public static void main(String[] args) {
        int resp;
        resp = soma(20,13);
        System.out.printf("Soma = %d", resp);
        
    }
    public static int soma(int n1, int n2){
        int resposta;
        resposta = n1+n2;
        return resposta;
    }
}