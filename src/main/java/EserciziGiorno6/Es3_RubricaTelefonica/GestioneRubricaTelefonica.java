package EserciziGiorno6.Es3_RubricaTelefonica;

import java.util.HashMap;
import java.util.Map;

public class GestioneRubricaTelefonica {

    private static Map<String, String> rubrica = new HashMap<String, String>();

    public static void main(String[] args) {

        // Aggiungo dati ad una mappa
        aggiungi("Mario", "123456789");
        aggiungi("Giuseppe", "987654321");
        aggiungi("Francesca", "654321987");

        // Rimuovo un elemento dalla mappa
        rimuovi("Francesca");

        // Cerca contatto dal numero di telefono
        cercaContatto("123456789");

        // Cerca contatto da nome
        cercaContattoDaNome("Giuseppe");

        // Stampo dati da una mappa
        stampaRubrica();
    }

    public static void aggiungi(String nome, String telefono) {
        rubrica.put(nome, telefono);
    }

    public static void rimuovi(String nome) {
        rubrica.remove(nome);
    }

    public static void cercaContatto(String telefono) {
        for (String nome : rubrica.keySet()) {
            if(telefono.equals(rubrica.get(nome))) {
                System.out.println("Il contatto con il numero " + telefono + " è: " + nome);
                break;
            }
        }
    }

    public static void cercaContattoDaNome(String nome) {
        System.out.println("Il contatto con il nome " + nome + " è: " + rubrica.get(nome));
    }

    public static void stampaRubrica() {
        for (String key : rubrica.keySet()) {
            System.out.println("Nome: " + key + " Telefono: " + rubrica.get(key));
        }
    }
}
