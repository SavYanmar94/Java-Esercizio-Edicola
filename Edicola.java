import java.util.Scanner;
import java.util.ArrayList;

public class Edicola {

    

    ArrayList<Pubblicazioni> pubblications = new ArrayList<Pubblicazioni>();   // la pubblicazione va salvata nell'ArrayList 
    boolean condizione = true; 
    double guadagnoGiornataPubblicazione; 
    double guadagnoUnitario; 
    int copieRese; 
    Scanner input = new Scanner(System.in);


    public void stampaResoconto() {

        System.out.println("Resoconto Giornaliero");
        System.out.println("*********************");

        double guadagnoTotale = 0.0;

        for(Pubblicazioni singolaPubblicazione : pubblications) {
        System.out.println("Titolo Pubblicazione: " + singolaPubblicazione.getNomePubblicazione());
        System.out.println("Numero copie ricevute: " + singolaPubblicazione.getCopieRicevute());
        System.out.println("Costo Unitario: " + singolaPubblicazione.getCostoCopieAcq() + " euro" );
        System.out.println("Vendite Totali Giornaliere: " + singolaPubblicazione.getVenditeTotali());
        guadagnoUnitario = singolaPubblicazione.getCostoCopieAcq() * (1 + singolaPubblicazione.getAggio() / 100.0) - singolaPubblicazione.getCostoCopieAcq();
        guadagnoUnitario = Math.round(guadagnoUnitario * 100.0) / 100.0;
        copieRese = singolaPubblicazione.getCopieRicevute() - singolaPubblicazione.getVenditeTotali(); 
        guadagnoGiornataPubblicazione = guadagnoUnitario * singolaPubblicazione.getVenditeTotali(); 
        guadagnoGiornataPubblicazione = Math.round(guadagnoGiornataPubblicazione* 100.0) / 100.0;
        System.out.println("Guadagno unitario: " + guadagnoUnitario + " euro");
        System.out.println("Copie rese indietro: " + copieRese);
        System.out.println("Guadagno Pubblicazione Giornata: " + guadagnoGiornataPubblicazione+ " euro");

        guadagnoTotale += guadagnoGiornataPubblicazione;
    }
        System.out.println("Guadagno Totale: " + (Math.round(guadagnoTotale * 100.0) / 100.0) + " euro");

    }
    
    public void inizializzaEdicola() {

        boolean ancora  = true; 

        while (ancora) { 

            System.out.println("Salve, premi 1 per registrare i dati della giornata, 2 per stampare il resoconto ");
            System.out.println("e 3 per uscire.");
            

            int scelta = input.nextInt(); 

            switch(scelta) {

            case 1 : 
            
            Pubblicazioni myPubblicazioni = new Pubblicazioni(); 
            myPubblicazioni.inserimentoRegistro(); 
            pubblications.add(myPubblicazioni); 
            System.out.println("Registrazione avvenuta con successo");


            break; 

            case 2 : 
            ancora = false; 
            stampaResoconto();
            break; 


            case 3 : 
            ancora = false; 
            System.out.println("Spegnimento...");
            break; 

            default: 
            System.out.println("Numero inserito sbagliato , premi 1 per registrare i dati della giornata, 2 per stampare il resoconto");
            break; 


        }


} 
    }

}




    