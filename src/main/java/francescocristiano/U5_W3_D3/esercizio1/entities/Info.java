package francescocristiano.U5_W3_D3.esercizio1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;


}
