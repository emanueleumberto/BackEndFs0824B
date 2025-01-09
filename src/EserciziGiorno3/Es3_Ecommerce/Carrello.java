package EserciziGiorno3.Es3_Ecommerce;

public class Carrello {

    private Cliente cliente;
    private Articolo[] listaArticoli;

    public Carrello(Cliente cliente, Articolo[] listaArticoli) {
        this.cliente = cliente;
        this.listaArticoli = listaArticoli;
    }

    public double totaleCostoArticoli() {
        double totale = 0;
        for (int i = 0; i < listaArticoli.length; i++) {
            totale += (listaArticoli[i].getPrezzo() * listaArticoli[i].getNumPezzi());
        }
        return totale;
    }


}
