import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float salario, credito, prestacao, taxa;
        int parcelas;
        System.out.println("Digite o salário, o valor de crédito solicitado, a qtde de parcelas desejada e a taxa de juros simples (% inteira) definida.");
        salario = entrada.nextFloat();
        credito = entrada.nextFloat();
        parcelas = entrada.nextInt();
        taxa = entrada.nextInt();
boolean regra;
regra = ((credito*(1+(taxa/100*parcelas))/parcelas) <= (0.3f*salario));
if(regra){
    prestacao = (credito*(1+(taxa/100*parcelas)))/parcelas;
    System.out.printf("Crédito aprovado. A ser pago em %d parcelas de R$ %.2f", parcelas, prestacao);
}else{
    System.out.println("Crédito reprovado.");
}
entrada.close();
    }
}