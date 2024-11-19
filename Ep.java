import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ep {


    public static void main(String[] args)
    {
        ArrayList<String[]> Prenotazioni = new ArrayList<String[]>();
        String nome;
        int numeroPre;
        int fila, posto;
        int selezione;

        //creo un array 3x8
        String[][] posti = new String[3][8];

        //Creo oggetto scanner
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);



        do{


        menu();
        selezione = scannerInt.nextInt();
        
        switch (selezione) {

            case 1:

            System.out.println("Quante pesone vuoi inserire?");
            numeroPre = scannerInt.nextInt();
    
            for(int i = 0; i< numeroPre; i++)
            {
                System.out.println("Inserisci il tuo nome");
                nome = scannerString.nextLine();
        
                System.out.println("Che fila vuoi prenotare? ");
                fila = scannerInt.nextInt();
        
                System.out.println("Che posto vuoi prenotare? ");
                posto = scannerInt.nextInt();
                
                if(posti[fila][posto] == null || posti[fila][posto] != "|X|" )
                {
                    posti[fila-1][posto-1] = " " + nome + " ";
                    Prenotazioni.add(new String[]{nome , String.valueOf(fila)  , String.valueOf(posto) });
                    
                    
                }
                else{
                    
                    System.out.println("Posto occupato!");
                     
        
                        System.out.println("Inserisci una nuvoa scelta");
        
                        System.out.println("Che fila vuoi prenotare? ");
                        fila = scannerInt.nextInt();
        
                        System.out.println("Che posto vuoi prenotare? ");
                        posto = scannerInt.nextInt();
                        
                        //finche il posto è occupato continuo il ciclo
                        while (posti[fila][posto] != null || posti[fila][posto] != "|X|" ){
    
                            System.out.println("Inserisci una nuvoa scelta");
        
                            System.out.println("Che fila vuoi prenotare? ");
                            fila = scannerInt.nextInt();
            
                            System.out.println("Che posto vuoi prenotare? ");
                            posto = scannerInt.nextInt();
                            
                        }
    
                posti[fila-1][posto-1] = " " + nome + " ";
                Prenotazioni.add(new String[]{nome , String.valueOf(fila)  , String.valueOf(posto) });
                    
                }
            
                
    
            }
                break;

            case 2:

                System.out.println("ELENCO POSTI DISPONIBILI:");
                //GESTIONE MATRICE POSTI LIBERI
                for(int x=0;x < posti.length; x++)
                {
                    for(int y = 0; y < posti[x].length; y++)
                    {
                        if(posti[x][y] == null)
                        {
                            posti[x][y] = " |X| ";
                        }
                        System.out.print(posti[x][y]);
                    }
                    System.out.println();
                }   
            break;
            case 3:
                System.out.println("ELENCO PRENOTAZIONI:");
                stampaPrenotazioni(Prenotazioni);
            break;

            case 4:
            System.out.print("Inserisci il nome della prenotazione: ");
            String nomeDaCercare = scannerString.nextLine();
                cercaPrenotazione(Prenotazioni, nomeDaCercare);
            break;

            case 5:
                break;
        
        }

    }while(selezione != 5);

        scannerInt.close();
        scannerString.close();



    }

    public static void menu() {
        System.out.println("Scegliere opzione (1,2,4): ");
        System.out.println("1.Aggiungi posti");
        System.out.println("2.Visualizza posti diposinibili");
        System.out.println("3.Visualizza prenotazioni");
        System.out.println("4.Cerca prenotazione");
        System.out.println("5.Exit");

    }

    public static void cercaPrenotazione(ArrayList<String[]> list, String nomeDaCercare)
    {
        for (String[] stringa : list) {
            for (String elemString : stringa) {
                
                String[] divisore = elemString.split(";");

                String nome = divisore[0].trim();

                if(nomeDaCercare.equals(nome))
                {
                    //stampo la stringa se trovo la corrispondenza tra nome da cercare e il nome tra le prenotazioni
                    System.out.println("Prenotazione trovata: " + Arrays.toString(stringa));
                    return;
                }
                else{
                    System.out.println("Nessuna prenotazione trovata!");
                }

                
            }
            
        }
    }

    public static void stampaPrenotazioni(ArrayList<String[]> list)
    {
        for(int i= 0; i<list.size();i++)
        {
            String[] arr = list.get(i);
            System.out.println("Prenotazione numero " + i + " :");
            for (String element : arr) {
                System.out.print(element);
                
            }

        }
    }
}