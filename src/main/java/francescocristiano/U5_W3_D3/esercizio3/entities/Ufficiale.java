package francescocristiano.U5_W3_D3.esercizio3.entities;

public abstract class Ufficiale {
    protected Ufficiale superiore;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public abstract void gestisciRichiesta(int importo);
}
