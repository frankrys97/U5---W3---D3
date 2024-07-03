package francescocristiano.U5_W3_D3.esercizio3.entities;

public class Maggiore extends Ufficiale {
    private final int stipendio = 3000;

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Richiesta gestita dal Maggiore, stipendio: " + stipendio);
        } else if (superiore != null) {
            superiore.gestisciRichiesta(importo);
        }
    }
}
