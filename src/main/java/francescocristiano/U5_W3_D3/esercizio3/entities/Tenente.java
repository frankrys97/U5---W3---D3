package francescocristiano.U5_W3_D3.esercizio3.entities;

public class Tenente extends Ufficiale {

    private final int stipendio = 1000;

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Richiesta gestita dal Tenente, stipendio: " + stipendio);
        } else if (superiore != null) {
            // In questo modo gli vado a dire che se l'importo è maggiore del suo stipendio ed esiste un suo superiore, allora
            // devo passare l'importo al superiore
            superiore.gestisciRichiesta(importo);
        }
    }
}
