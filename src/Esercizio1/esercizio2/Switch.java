package Esercizio1.esercizio2;

import java.util.Scanner;

public class Switch {
    public static void stampaMessaggio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero compreso tra 0 e 3");
        int x = scanner.nextInt();
        switch(x){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Non compreso tra 0 e 3");
        }
    }
}
