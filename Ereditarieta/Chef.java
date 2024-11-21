package Ereditarieta;
import java.util.Scanner;

public class Chef extends Utente {

    public Chef()
    {
        this.tipoUtente = 1;
    }

    // @Override
    // public void addPiatto(ArrayList<String[]> piattiList, String nomePiatto)
    // {
    //     piattiList.add(new String[]{});
    // }

    @Override
    public void addPiatto() {
        
        Scanner scanner = new Scanner(System.in);
        // Raccolgo i parametri
        System.out.println("Inserisci nome del piatto:");
        String nomePiatto = scanner.nextLine();

        // Logica di aggiunta
        String[] piatto = {nomePiatto};
        piatti.add(piatto);

        scanner.close();
        System.out.println("Piatto aggiunto con successo!");
            };
    }
