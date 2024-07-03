package francescocristiano.U5_W3_D3.esercizio3.entities;

public class Generale extends Ufficiale {
    private final int stipendio = 5000;

    @Override
    public void gestisciRichiesta(int importo) {
        if (importo <= stipendio) {
            System.out.println("Richiesta gestita dal Generale, stipendio: " + stipendio);
        } else {
            System.out.println("Nessuno è abbastanza ricco per gestire la richiesta");
        }
    }
}
