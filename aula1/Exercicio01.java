public class Exercicio01 {
    public static void main(String[] args) {
        float valor1=15;
        float valor2=7;
        float soma; //não é possível armazenar uma variável maior em outra menor, ou seja se é float, a conta não pode ser int
        float divisão; 
        float subtração;
        float multiplicação;
        float resto;
        soma = valor1+valor2; 
        divisão = valor1/valor2; //o código primeiro realiza a operação, para depois executar
        subtração = valor1-valor2;
        multiplicação = valor1*valor2;
        resto = valor1%valor2;
        System.out.println("Realizando as operações aritiméticas entre os números 15 e 7 temos:\nSoma= " + soma + "\nSubtração= " + subtração + "\nMultiplicação= " + multiplicação + "\nDivisão= " + divisão + " com resto:" + resto);
        System.out.println("Fim!");
    }
}