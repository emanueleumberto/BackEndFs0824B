package EserciziGiorno3.Es3_Ecommerce;

import java.util.Date;

public class Cliente {

    private String codice;
    private String nomeCognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(String codice, String nomeCognome, String email, Date dataIscrizione) {
        this.codice = codice;
        this.dataIscrizione = dataIscrizione;
        this.email = email;
        this.nomeCognome = nomeCognome;
    }
}
