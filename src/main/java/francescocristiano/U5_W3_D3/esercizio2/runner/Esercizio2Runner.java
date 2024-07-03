package francescocristiano.U5_W3_D3.esercizio2.runner;

import francescocristiano.U5_W3_D3.esercizio2.entities.Libro;
import francescocristiano.U5_W3_D3.esercizio2.entities.Pagina;
import francescocristiano.U5_W3_D3.esercizio2.entities.SezioneLibro;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Esercizio2Runner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println();
        System.out.println("Esercizio 2:");
        System.out.println();

    /*    for (int i = 1; i <= 10; i++) {
            Pagina pagina = new Pagina(i, "Testo Pagina " + i);
            pagina.stampa();
        }*/

        SezioneLibro introduzione = new SezioneLibro("Introduzione");
        for (int i = 1; i <= 5; i++) {
            Pagina pagina = new Pagina(i, "Testo Pagina " + i);
            introduzione.aggiungiSottoElemento(pagina);
        }
        SezioneLibro sezione2 = new SezioneLibro("Capitolo 1");
        for (int i = 6; i <= 10; i++) {
            Pagina pagina = new Pagina(i, "Testo Pagina " + i);
            sezione2.aggiungiSottoElemento(pagina);
        }

        introduzione.stampa();
        System.out.println();
        sezione2.stampa();
        System.out.println();

        Libro libro = new Libro("Il Signore degli Anelli", 19.99, List.of("Francesco Cossu", "Chiara Fais", "Vasco Panigi"));
        libro.aggiungiSottoElemento(introduzione);
        libro.aggiungiSottoElemento(sezione2);
        System.out.println();
        libro.stampa();
        System.out.println();
        System.out.println("Il libro ha " + libro.getNumeroPagine() + " pagine.");
        System.out.println();

    }
}
