package EserciziGiorno5.Es1_Interi;

import java.util.Random;
import java.util.Scanner;

public class GestioneInteri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = generaArrayRandom();
        stampaArray(arr);
        do {
            // Chiedo un nuovo numero e una posizione ad un utente
            System.out.print("Inserisci un numero da 1 a 10 oppure 0 per termimare: ");
            int num = Integer.parseInt(sc.nextLine());
            if (num > 0 && num <= 10) {
                System.out.print("Inserisci una posizione: ");
                int pos = Integer.parseInt(sc.nextLine());
                try {
                    arr[pos] = num;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Indice non corretto");
                }
            } else if(num == 0) {
                System.out.println("Programma terminato");
                break;
            } else {
                System.out.print("Valore non corretto ");
            }
            stampaArray(arr);
        } while (true);

    }

    public static int[] generaArrayRandom() {
        int[] arr = new int[5];

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1, 11);
        }
        return arr;
    }

    public static void stampaArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Posizione: " + i + " Valore: " + arr[i]);
        }
    }
}
