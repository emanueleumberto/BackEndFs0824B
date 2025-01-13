package EserciziGiorno5.Es3_ContoCorrente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GestioneContoCorrente {
    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(GestioneContoCorrente.class);

        ContoCorrente cc = new ContoCorrente("Mario Rossi", 100);
        try {
            cc.preleva(50);
            //System.out.println("Il saldo residuo del Conto corrente è: " + cc.restituisciSaldo());
            log.info("Il saldo residuo del Conto corrente è: " + cc.restituisciSaldo());
            cc.preleva(25);
            System.out.println("Il saldo residuo del Conto corrente è: " + cc.restituisciSaldo());
            cc.preleva(50);
            System.out.println("Il saldo residuo del Conto corrente è: " + cc.restituisciSaldo());
        } catch (BancaException e) {
            //System.out.println(e.getMessage());
            log.error(e.getMessage());
        }

        ContoOnLine co = new ContoOnLine("Giuseppe Verdi", 250, 100);
        try {
            co.preleva(50);
            System.out.println("Il saldo residuo del Conto corrente OnLine è: " + co.restituisciSaldo());
            co.preleva(100);
            System.out.println("Il saldo residuo del Conto corrente OnLine è: " + co.restituisciSaldo());
            co.preleva(100);
            System.out.println("Il saldo residuo del Conto corrente OnLine è: " + co.restituisciSaldo());
            co.preleva(1);
            System.out.println("Il saldo residuo del Conto corrente OnLine è: " + co.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println(e.getMessage());
        }

    }
}
