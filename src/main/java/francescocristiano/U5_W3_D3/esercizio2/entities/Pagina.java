package francescocristiano.U5_W3_D3.esercizio2.entities;

import francescocristiano.U5_W3_D3.esercizio2.interfaces.ComponenteLibro;

public class Pagina implements ComponenteLibro {

    private int numeroPagina;
    private String testo;


    public Pagina(int numeroPagina, String testo) {
        this.numeroPagina = numeroPagina;
        this.testo = testo;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina " + numeroPagina + ": " + testo);
    }
}
