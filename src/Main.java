import Esercizio1.IfElse;
import Esercizio1.esercizio2.Switch;
import Esercizio1.esercizio2.esercizio3.While;
import Esercizio1.esercizio2.esercizio3.esercizio4.For;

public class Main {
    public static void main(String[] args) {
        System.out.println(IfElse.stringPariDispari("Cavol"));
        System.out.println(IfElse.annoBisestile(2004));
        Switch.stampaMessaggio();
        While.suddividiCaratteri();
        For.stampaNumero();
    }
}