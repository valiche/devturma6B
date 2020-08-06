public class Sample03 {
    public static void main(String[] args) {
        int cont;
        cont = 1;
        while(cont<10){
            if(cont%2==0){
                System.out.println(cont);
            }
            cont++; //abrev. cont = cont+1
        }
        System.out.println("Fim!");
    }
}