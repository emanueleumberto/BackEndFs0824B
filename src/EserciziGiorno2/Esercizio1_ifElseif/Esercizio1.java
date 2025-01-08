package EserciziGiorno2.Esercizio1_ifElseif;

public class Esercizio1 {

    public boolean stringaPariDispari(String str) {
        /* if(str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        } */

        return str.length() % 2 == 0 ? true : false;
    }

    public boolean annoBisestile(int anno) {
        if(anno % 400 == 0) {
            return true;
        } else if(anno % 4 == 0 && anno % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

}
