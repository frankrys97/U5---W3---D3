package francescocristiano.U5_W3_D3.esercizio1.entities;

import francescocristiano.U5_W3_D3.esercizio1.interfaces.DataSource;
import lombok.Getter;

@Getter
public class UserData {
    private String nomeCompleto;
    private int età;

    public void getData(DataSource ds) {
        this.nomeCompleto = ds.getNomeCompleto();
        this.età = ds.getEta();
    }
}
