package francescocristiano.U5_W3_D3.esercizio1.entities;

import francescocristiano.U5_W3_D3.esercizio1.interfaces.DataSource;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class InfoAdapter implements DataSource {
    // Il passaggio di creazione di questa classe è che praticamente UserData è una classe che ha un metodo che prende come parametro
    // un'interfaccia DataSource, che ha un metodo che restituisce il nome e l'eta'
    // Info invece è una classe dove abbiamo i dati del nostro utente
    // In un certo qual modo l'obiettivo è quello di riuscire a passare come parametro del metodo della classe UserData un'interfaccia DataSource
    // ma noi abbiamo Info dove sono contenuti i dati del nostro utente
    // quindi si crea una classe apposita che funge da adattatore, che implementa l'interfaccia
    // ovvero acquisisce tutti i metodi che sono propri di quell'interfaccia
    // Questa classe avrà come attributo proprio una classe Info, quindi per istanziarla ci servirà proprio passargli un Info
    // Una volta passatagli questa classe andiamo a sovrascrivere i metodi acquisiti con l'interfaccia DataSource
    // nel modo a cui servono a noi
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate oggi = LocalDate.now();
        LocalDate dataDiNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return Period.between(dataDiNascita, oggi).getYears();
    }
}
