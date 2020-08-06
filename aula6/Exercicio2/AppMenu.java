package Exercicio2;

import java.util.Scanner;

public class AppMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Conta conta = null;
        int cod, op;
        float taxaP, limite, valor;
        do {
            System.out.println(
                    "Menu:\n 1- Nova conta corrente \n2- Nova conta poupança \n 3-Nova conta especial \n 4-Saldo \n5-Saque \n6-Deposito \n 7-Sair \nOpção: ");
            op = in.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Nova conta. Digite o número da conta corrente:");
                    cod = in.nextInt();
                    conta = new ContaCorrente(cod);
                    break;
                case 2:
                    System.out.println("Nova conta. Digite o número da conta poupança:");
                    cod = in.nextInt();
                    System.out.println("Digita a taxa a ser usada:");
                    taxaP = in.nextFloat();
                    conta = new ContaPoupanca(cod);
                    ContaPoupanca.setTaxa(taxaP);
                    break;
                case 3:
                    System.out.println("Nova conta. Digite o número da conta especial:");
                    cod = in.nextInt();
                    System.out.println("Qual será o limite?");
                    limite = in.nextFloat();
                    conta = new ContaEspecial(cod, limite);
                    break;
                case 4:
                    System.out.println("Digite o número da conta:");
                    cod = in.nextInt();
                    if (conta != null) {
                        System.out.println(conta.exibirDados());
                        break;
                    }
                    break;
                case 5:
                    System.out.printf("Saldo = %.2f | Selecione valor para saque:", conta.getSaldo());
                    valor = in.nextFloat();
                    conta.setSaque(valor);
                    System.out.println("Saldo atual = " + conta.getSaldo());
                    break;
                case 6:
                System.out.printf("Saldo = %.2f | Qual o valor do depósito?", conta.getSaldo());
                    valor = in.nextFloat();
                    conta.setDeposito(valor);
                    System.out.println("Saldo atual = " + conta.getSaldo());
                    break;
                case 7:
                    System.out.println("Sessão encerrada!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 7);
in.close();
    }
}