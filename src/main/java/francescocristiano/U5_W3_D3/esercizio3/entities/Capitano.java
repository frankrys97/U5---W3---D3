package francescocristiano.U5_W3_D3.esercizio3.entities;

public class Capitano extends Ufficiale {

    private final int stipendio = 2000;

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= 1000) {
            System.out.println("Richiesta gestita dal Capitano, stipendio: " + stipendio);
        } else if (superiore != null) {
            superiore.gestisciRichiesta(importo);
        }
    }
}
