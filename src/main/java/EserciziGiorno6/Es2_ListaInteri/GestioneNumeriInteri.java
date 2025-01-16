package EserciziGiorno6.Es2_ListaInteri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GestioneNumeriInteri {

    public static void main(String[] args) {

        System.out.println("Lista numeri random: ");
        List<Integer> listaNumeriRandom = randomNumber(10);
        stampaLista(listaNumeriRandom);
        System.out.println("Lista numeri random in ordine inverso: ");
        List<Integer> listaCompleta = listaInversa(listaNumeriRandom);
        stampaLista(listaCompleta);
        System.out.println("Lista numeri indice pari: ");
        StampaPariDispari(listaNumeriRandom, true);
        System.out.println("Lista numeri indice dispari: ");
        StampaPariDispari(listaNumeriRandom, false);


    }

    public static List<Integer> randomNumber(int num) {
        List<Integer> lista = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < num ; i++) {
            lista.add(rand.nextInt(0, 101));
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> listaInversa(List<Integer> lista) {
        List<Integer> listaCompleta = new ArrayList<Integer>(lista);
        for (int i = lista.size()-1; i >= 0 ; i--) {
            listaCompleta.add(lista.get(i));
        }
        return listaCompleta;
    }

    public static void stampaLista(List<Integer> lista) {
        for (Integer i : lista) {
            System.out.println(i);
        }
    }

    public static void StampaPariDispari(List<Integer> lista, boolean b) {
        for (int i = 0; i < lista.size(); i++) {
            if(b) {
                if (i % 2 == 0) {
                    System.out.println("Posizione [" + i + "] Valore: " + lista.get(i));
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println("Posizione [" + i + "] Valore: " + lista.get(i));
                }
            }
        }
    }

}
