package EserciziGiorno5.Es2_CalcoloLitriAuto;

import java.util.Scanner;

public class GestioneLitriKmAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserisci i km percorsi: ");
        int km = Integer.parseInt(sc.nextLine());
        System.out.print("Inserisci i litri consumati: ");
        double litri = Integer.parseInt(sc.nextLine());

        try {
            double kmLitri = (double) km / litri;
            System.out.println("La mia auto percorre " + kmLitri + " km al litro");
        } catch (ArithmeticException e) {
            System.out.println("Non puoi dividere per 0");
        }


    }
}
