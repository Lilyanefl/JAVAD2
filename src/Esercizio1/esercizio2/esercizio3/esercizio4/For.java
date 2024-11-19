package Esercizio1.esercizio2.esercizio3.esercizio4;

import java.util.Scanner;

public class For {
    public static void stampaNumero(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci numero");
        int y = scanner.nextInt();
        for(int i = y; i>=0; i--){
            System.out.println("Conto alla rovescia");
            System.out.println(i);
        }
    }
}
