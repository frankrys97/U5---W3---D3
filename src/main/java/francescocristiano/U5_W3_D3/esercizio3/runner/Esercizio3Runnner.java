package francescocristiano.U5_W3_D3.esercizio3.runner;

import francescocristiano.U5_W3_D3.esercizio3.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Esercizio3Runnner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println();
        System.out.println("Esercizio 3: ");
        System.out.println();

        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonello colonello = new Colonello();
        Generale generale = new Generale();

        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonello);
        colonello.setSuperiore(generale);

        int[] richieste = {1000, 2000, 3000, 4000, 5000};
        for (int richiesta : richieste) {
            tenente.gestisciRichiesta(richiesta);
        }
    }
}
