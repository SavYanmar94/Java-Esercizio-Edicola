import java.util.Scanner;

public class Pubblicazioni {

    private String nomePubblicazione; // maggiore di 25 caratteri
    private int copieRicevute; // maggiore di zero 
    private double costoCopieAcq;  // maggiore di zero 
    private int aggio; 
    private int venditeTotali;  // copie ( venditeTotali - copie Ricevute), non serve nemmeno fare la variabile 
    Scanner input = new Scanner(System.in); 



    
    public void setNomePubblicazione(String nomePubblicazione) {

        boolean ancora = true; 

        do {

            if (nomePubblicazione.length() >= 2 && nomePubblicazione.length() < 26 ){

            this.nomePubblicazione = nomePubblicazione; 
            ancora = false; 

        } else {

            System.out.println("La il nome della pubblicazione deve essere minore di 25 caratteri");
            System.out.println("Inserisci un nome valido:");
            nomePubblicazione = input.nextLine(); 
        }
        } while(ancora); 

    } 

    public String getNomePubblicazione(){
        return nomePubblicazione; 
    }

    public void setCopieRicevute(int copieRicevute ){

        boolean ancora = true; 

        do { 

            if ( copieRicevute > 0 ) {
                this.copieRicevute = copieRicevute; 
                ancora = false; 

            } else {

            System.out.println("Inserisci il numero di copie corretto");
            copieRicevute = input.nextInt(); 


            }

    } while (ancora); 

}

    public int getCopieRicevute () {

        return copieRicevute; 

    }

    public void setCostoCopieAcq (double costoCopieAcq) {

        boolean ancora = true; 

        do {

            if (costoCopieAcq > 1.00 ){

            this.costoCopieAcq = costoCopieAcq; 
            ancora = false; 

        } else {

            System.out.println("Il Costo Copie Acquistate deve essere maggiore di 1 euro");
            System.out.println("Inserisci un importo valido di acquisto:");
            costoCopieAcq = input.nextDouble(); 
        }
        } while(ancora); 

    } 


    public double getCostoCopieAcq () {

        return costoCopieAcq; 

    }


    public void setAggio(int aggio) {

    boolean ancora = true; 

    do {

        if (aggio >=  5 && aggio <= 20 ){
            this.aggio = aggio;
            ancora = false;

        } else { 
            System.out.println("L'aggio deve essere compreso tra 5 e 20 ");
            System.out.println("Inserisci un aggio valido:");
            aggio = input.nextInt();


        }

    } while (ancora); 

}

    public int getAggio() {
        return aggio;
    }


    public void setVenditeTotali (int venditeTotali) { 


        boolean ancora = true; 

    do {

        if (venditeTotali <= getCopieRicevute()) {
            this.venditeTotali = venditeTotali;
            ancora = false;

        } else { 
            System.out.println("Il numero di copie venduto è maggiore di quelle ricevute ! ");
            System.out.println("Reinserisci il numero di copie vendute : ");
            venditeTotali= input.nextInt();


        }

    } while (ancora);




    }

    public int getVenditeTotali() {
        return venditeTotali;
    }


    public void inserimentoRegistro() {

        System.out.println("Inserire il nome della pubblicazione: ");
        setNomePubblicazione(input.nextLine()); 
        System.out.println("Inserire il numero di copie ricevute: ");
        setCopieRicevute(input.nextInt()); 
        System.out.println("Inserire il costo unitario delle copie acquistate: ");
        setCostoCopieAcq(input.nextDouble()); 
        System.out.println("Inserisci l'aggio compreso tra 5 ed il 20");
        setAggio(input.nextInt());
        System.out.println("Numero totale copie vendute");
        setVenditeTotali(input.nextInt()); 

    }

}