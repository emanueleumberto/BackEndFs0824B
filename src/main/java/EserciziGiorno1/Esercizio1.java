package EserciziGiorno1;

import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("Soluzione Esercizio 1");

        int x = 25;
        int y = 10;
        String str = "Sono il numero: ";
        String[] arrStr = {"uno", "due", "tre", "quattro", "cinque"};

        System.out.println("Il prodotto calcolato tra i numeri " + x + " e " + y + " è uguale a " + moltiplica(x, y));

        System.out.println(concatena(str, x));

        System.out.println(Arrays.toString(inserisciInArray(arrStr, "nuovo")));
    }

    public static int moltiplica(int num1, int num2){
        return num1 * num2;
    }

    public static String concatena(String s, int n){
        return s + n;
    }

    public static String[] inserisciInArray(String[] arr, String s){
        String[] newArr = new String[6];
        /*newArr[0] = arr[0];
        newArr[1] = arr[1];
        newArr[2] = s;
        newArr[3] = arr[2];
        newArr[4] = arr[3];
        newArr[5] = arr[4];*/
        for(int i=0; i<newArr.length; i++){
            if(i<2) {
                newArr[i] = arr[i];
            } else if(i == 2) {
                newArr[i] = s;
            } else {
                newArr[i] = arr[i-1];
            }
        }
        return newArr;
    }
}