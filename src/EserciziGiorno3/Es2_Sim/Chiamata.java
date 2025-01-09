package EserciziGiorno3.Es2_Sim;

public class Chiamata {
    private String numeroChiamato;
    private double durata;

    public Chiamata(String numeroChiamato, double durata){
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public void infoChiamata() {
        System.out.println("Chiamata: " + this.numeroChiamato + " Durata: " + this.durata);
    }
}
