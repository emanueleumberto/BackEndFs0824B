package EserciziGiorno5.Es3_ContoCorrente;

public class ContoOnLine extends ContoCorrente {

    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo " + saldo + " - Num movimenti " + nMovimenti +
        " - Max movimenti" + maxMovimenti + " Max prelievo: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if(x <= maxPrelievo) {
            super.preleva(x);
        }

        if(x > maxPrelievo) {
            throw  new BancaException("Il prelievo non è disponibile!!!");
        }
    }
}
