package francescocristiano.U5_W3_D3.esercizio2.entities;

import francescocristiano.U5_W3_D3.esercizio2.interfaces.ComponenteLibro;

import java.util.ArrayList;
import java.util.List;

public class SezioneLibro implements ComponenteLibro {
    private String titoloSezione;
    private List<ComponenteLibro> sottoElementi = new ArrayList<>();


    public SezioneLibro(String titoloSezione) {
        this.titoloSezione = titoloSezione;
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
        System.out.println("Sezione: " + titoloSezione);
        for (ComponenteLibro sottoElemento : sottoElementi) {
            sottoElemento.stampa();
        }
    }
}
