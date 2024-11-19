package Esercizio1.esercizio2.esercizio3;

import java.util.Scanner;

public class While {
    public static void suddividiCaratteri(){
        Scanner scanner = new Scanner(System.in);
        String x=" ";
        while(!x.equals(":q")){
            System.out.println("Inserisci una parola, oppure inserisci :q per uscire ");
            x = scanner.nextLine();
            if(x.equals(":q")){
                System.out.println("Sto uscendo dal programma");
                break;
            }
            for(int i = 0; i < x.length(); i++){
                System.out.print(  x.charAt(i)+ ",");
            }
        }
    }
}
