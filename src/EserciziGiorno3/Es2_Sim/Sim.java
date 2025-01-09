package EserciziGiorno3.Es2_Sim;

import java.util.Arrays;

public class Sim {

    private String numero;
    private double credito;
    private Chiamata[] listaChiamate;

    public Sim(String numero){
        this.numero = numero;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
    }

    public void aggiungiCredito(double credito) {
        this.credito += credito;
    }

    public void stampaDatiSim() {
        System.out.println("Sim numero: " + this.numero);
        System.out.println("Credito disponibile: " + this.credito);
        // System.out.println("Lista chiamate: " + Arrays.toString(listaChiamate));
        for (int i = 0; i < listaChiamate.length; i++) {
            if(listaChiamate[i] != null) {
                listaChiamate[i].infoChiamata();
            }
        }
    }

    public void effettuaChiamata(Chiamata c) {
        if(this.credito > 0) {
            for (int i = 0; i < this.listaChiamate.length; i++) {
                if (this.listaChiamate[i] == null) {
                    this.listaChiamate[i] = c;
                    return;
                }
            }
        } else {
            System.out.println("Credito negativo!!");
        }
    }

}
