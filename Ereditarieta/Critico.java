package Ereditarieta;
import java.util.Scanner;

public class Critico extends Utente {
    
    public Critico(){
        this.tipoUtente = 2;
    }


    @Override 
    public void addRecensione()
    {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        getListaPiatti();

        // Raccolgo i parametri
        System.out.println("Inserisci nome del piatto:");
        String nomePiatto = scanner.nextLine();

        for (String[] arr : piatti) {
            for (String string : arr) {
                if (string.equals(nomePiatto)) {

                    System.err.println("Aggiungi recensione: ");
                    int valutazioneInserita = scannerInt.nextInt();

                    String[] valutazione = {"Nome piatto: " + string , "Voto: " + String.valueOf(valutazioneInserita)};
                    ValutazionePiatti.add(valutazione);
                }
                
            }
            
        }

        scanner.close();
        scannerInt.close();
    }



}
