package francescocristiano.U5_W3_D3.esercizio1.runner;

import francescocristiano.U5_W3_D3.esercizio1.entities.Info;
import francescocristiano.U5_W3_D3.esercizio1.entities.InfoAdapter;
import francescocristiano.U5_W3_D3.esercizio1.entities.UserData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Esercizio1Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println();
        System.out.println("Esercizio 1:");
        // Qui posso istanziare la classe info con i dati dell'utente
        Info info1 = new Info("Giggino", "Rossi", new Date(97, 10, 27));

        // Ora la classe InfoAdapter, che implementa l'interfaccia DataSource, passo la classe info come parametro
        InfoAdapter infoAdapter = new InfoAdapter(info1);

        // Istanzio la classe UserData
        UserData userData = new UserData();

        // Chiamo il metodo getData, che andrà a settare i valori della classe UserData, passandogli il parametro infoAdapter, che è
        // una classe che implementa l'interfaccia DataSource
        userData.getData(infoAdapter);


        // Stampo i valori
        System.out.println("Risultati esercizio 1");
        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Eta': " + userData.getEtà());

    }
}
