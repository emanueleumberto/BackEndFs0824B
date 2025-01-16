package EserciziGiorno3.Es1_Rettangolo;

public class GestioneRettangolo {

    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(10, 5);
        Rettangolo r2 = new Rettangolo(8.5, 5.1);

        System.out.println("Soluzione 1");
        stampaDueRettangoli(r1, r2);
        System.out.println("Soluzione 2");
        r1.stampaDueRettangoli(r2);

    }

    // Soluzione 1
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Perimetro del Rettangolo: " + r.calcolaPerimetro());
        System.out.println("Area del Rettangolo: " + r.calcolaArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Stampa Rettangolo 1");
        stampaRettangolo(r1);
        System.out.println("Stampa Rettangolo 2");
        stampaRettangolo(r2);

        double sommaArea = r1.calcolaArea() + r2.calcolaArea();
        System.out.println("La Somma delle aree dei rettangoli è: " + sommaArea);
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("La Somma dei perimentri dei rettangoli è: " + sommaPerimetri);
    }

}
