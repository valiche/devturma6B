package uri;

import java.util.Scanner;

public class Uri1047 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hi, mi, hf, mf, dur, hd, md;
        System.out.println("Início e Fim:");
        hi = in.nextInt();
        mi = in.nextInt();
        hf = in.nextInt();
        mf = in.nextInt();
        if (hi == hf && mi == mf) {
            System.out.print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            if(hf>hi || (hf==hi && mf>mi)){
                dur = (hf * 60 + mf) - (hi * 60 + mi);
            }else{
                dur = 24*60 + (hf * 60 + mf) - (hi * 60 + mi);
            }
            hd = dur / 60;
            md = dur % 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", hd, md);
        }
        in.close();
    }
}