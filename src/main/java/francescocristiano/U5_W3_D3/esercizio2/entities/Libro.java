package francescocristiano.U5_W3_D3.esercizio2.entities;

import francescocristiano.U5_W3_D3.esercizio2.interfaces.ComponenteLibro;

import java.util.ArrayList;
import java.util.List;

public class Libro implements ComponenteLibro {

    private String titoloLibro;
    private double prezzo;
    private List<String> listaAutori = new ArrayList<>();
    private List<ComponenteLibro> sottoElementi = new ArrayList<>();


    public Libro(String titoloLibro, double prezzo, List<String> listaAutori) {
        this.titoloLibro = titoloLibro;
        this.prezzo = prezzo;
        this.listaAutori = listaAutori;
    }


    public void aggiungiSottoElemento(ComponenteLibro sottoElemento) {
        sottoElementi.add(sottoElemento);
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagineTotale = 0;

        for (ComponenteLibro sottoElemento : sottoElementi) {
            numeroPagineTotale += sottoElemento.getNumeroPagine();
        }
        return numeroPagineTotale;
    }

    @Override
    public void stampa() {
        System.out.println("Libro: " + titoloLibro + " - Prezzo: " + prezzo + " - Autori: " + String.join(", ", listaAutori));

        for (ComponenteLibro sottoElemento : sottoElementi) {
            System.out.println();
            sottoElemento.stampa();
        }
    }
}
