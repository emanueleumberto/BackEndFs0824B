package EserciziGiorno2;

import EserciziGiorno2.Esercizio1_ifElseif.Esercizio1;
import EserciziGiorno2.Esercizio2_switch.Esercizio2;
import EserciziGiorno2.Esercizio3_while.Esercizio3;
import EserciziGiorno2.Esercizio4_for.Esercizio4;

import java.util.Scanner;

public class GestioneEsercizi {
    public static void main(String[] args) {

        // Soluzione 1 esercizio - IF-ELSE
        Esercizio1 es1 = new Esercizio1();
        boolean pariDispari = es1.stringaPariDispari("Epicode");
        System.out.println(pariDispari);

        boolean annoBisestile = es1.annoBisestile(2024);
        System.out.println(annoBisestile);

        // Soluzione 2 esercizio - SWITCH
        Esercizio2 es2 = new Esercizio2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un numero da 0 a 3");
        int num = sc.nextInt();
        es2.stampaLettere(num);

        // Soluzione 3 esercizio - While
        Esercizio3 es3 = new Esercizio3();
        //es3.suddividiCaratteriDoWhile();
        es3.suddividiCaratteriWhile();

        // Soluzione 4 esercizio - For
        Esercizio4 es4 = new Esercizio4();
        System.out.print("Inserisci un numero: ");
        int num2 = sc.nextInt();
        es4.contoAllaRovescia(num2);
        System.out.println("FINE");
    }
}
