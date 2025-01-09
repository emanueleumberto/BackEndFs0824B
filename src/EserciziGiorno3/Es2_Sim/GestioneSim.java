package EserciziGiorno3.Es2_Sim;

public class GestioneSim {

    public static void main(String[] args) {
        Sim s1 = new Sim("340.123456789");
        s1.aggiungiCredito(10);
        Chiamata c1 = new Chiamata("320.987654321", 2.6);
        s1.effettuaChiamata(c1);
        s1.effettuaChiamata(new Chiamata("338.654987123", 5.1));
        s1.stampaDatiSim();
    }

}
