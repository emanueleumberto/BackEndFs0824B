package EserciziGiorno2.Esercizio2_switch;

public class Esercizio2 {


    public void stampaLettere(int num) {
        switch (num) {
            case 0: {
                System.out.println("Zero");
                break;
            }
            case 1: {
                System.out.println("Uno");
                break;
            }
            case 2: {
                System.out.println("Due");
                break;
            }
            case 3: {
                System.out.println("Tre");
                break;
            }
            default: {
                System.out.println("Valore errato");
                break;
            }
        }
    }

}
