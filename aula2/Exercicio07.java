import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int ladoa, ladob, ladoc;
        ladoa = entrada.nextInt();
        ladob = entrada.nextInt();
        ladoc = entrada.nextInt();
        entrada.close();
        if(ladoa>ladob+ladoc || ladob>ladoa+ladoc || ladoc>ladoa+ladob){
            System.out.println("Essas medidas não configuram um triângulo.");
        }else{
            if (ladoa==ladob && ladoa==ladoc){
                System.out.println("Triângulo equilátero.");
            }else{
                if(ladoa==ladob || ladoa==ladoc || ladob==ladoc){
                    System.out.println("Triângulo isósceles.");
                }else{
                    System.out.println("Triângulo escaleno.");
                }
            }
        }
    }
}