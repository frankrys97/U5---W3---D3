package francescocristiano.U5_W3_D3.esercizio3.entities;

public class Colonello extends Ufficiale {
    private final int stipendio = 4000;

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Richiesta gestita dal Colonello, stipendio: " + stipendio);
        } else if (superiore != null) {
            superiore.gestisciRichiesta(importo);
        }
    }
}
