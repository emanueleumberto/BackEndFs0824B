package EserciziGiorno3.Es1_Rettangolo;

public class Rettangolo {

    private double larghezza;
    private double altezza;

    public Rettangolo(double larghezza, double altezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return larghezza * altezza;
    }

    public double calcolaPerimetro() {
        return larghezza + altezza + larghezza + altezza;
    }

    // Soluzione due
    public void stampaRettangolo() {
        System.out.println("Perimetro del Rettangolo: " + this.calcolaPerimetro());
        System.out.println("Area del Rettangolo: " + this.calcolaArea());
    }

    public void stampaDueRettangoli(Rettangolo r) {
        System.out.println("Stampa Rettangolo 1");
        this.stampaRettangolo();
        System.out.println("Stampa Rettangolo 2");
        r.stampaRettangolo();

        double sommaArea = this.calcolaArea() + r.calcolaArea();
        System.out.println("La Somma delle aree dei rettangoli è: " + sommaArea);
        double sommaPerimetri = this.calcolaPerimetro() + r.calcolaPerimetro();
        System.out.println("La Somma dei perimentri dei rettangoli è: " + sommaPerimetri);
    }

}
