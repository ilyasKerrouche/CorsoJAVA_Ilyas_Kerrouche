import java.util.ArrayList;
import java.util.Scanner;

public class Spedizioni {
    
    public static void main(String[] args)
    {
        ArrayList<String[]> spedizioni = new ArrayList<String[]>();
        int selezionato;

        //Creo oggetto scanner
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        do{

            menu();

            selezionato = scannerInt.nextInt();

            switch (selezionato) {
                case 1:
                        System.out.println("Quanti Rossi spedisci?");
                        int rosso = scannerInt.nextInt();
                        System.out.println("Quanti Blu spedisci?");
                        int blu = scannerInt.nextInt();
                        System.out.println("Quanti Verdi spedisci?");
                        int verde = scannerInt.nextInt();
                        System.out.println("Quanti Nero spedisci?");
                        int nero = scannerInt.nextInt();


                        inserisciSped(rosso, verde, blu, nero, spedizioni);

                    break;
                    case 2:
                        stampaSpedizioni(spedizioni);
                        break;
                    
                    case 3:
                        totColori(spedizioni);
                        break;
                        
                    case 4:
                        System.out.println("Inserisci il colore che vuoi cercare");
                        String coloreInput = scannerString.nextLine();
                        cercaColore(spedizioni, coloreInput);
                    break;
                    case 5:
                    break;
                default:
                    break;
            }





        }while(selezionato != 5);




        scannerInt.close();
        scannerString.close();

    }

    public static void menu()
    {
        System.out.println("Scegliere opzione (1,2,4): ");
        System.out.println("1.Aggiungi spedizione");
        System.out.println("2.Mostra spedizioni");
        System.out.println("3.Mostra numero colori");
        System.out.println("4.Mostra numero colori");
        System.out.println("5.Exit");
    }


    public static void inserisciSped(int r, int v, int b, int n, ArrayList<String[]> list)
    {
        list.add(new String[]{"Rosso:" + r,"Verde: " + v,"Blu: " + b, "Nero: " + n});
    }


    public static void stampaSpedizioni(ArrayList<String[]> list)
    {
        for(int i = 0; i< list.size(); i++)
        {   
            //ottengo l'array
            String[] arr = list.get(i);
            System.out.println("spedizione " + i + ":" );
            for (String element : arr) {

                System.out.println(" " + element);
                
            }
        }
    }

    public static void totColori(ArrayList<String[]> list)
    {
        int sommaRossi = 0;
        int sommaVerde = 0;
        int sommaBlu = 0;
        int sommaNero = 0;

        for (String[] stringa : list) {
            for (String element : stringa) {
                String[] diviso = element.split(":");

                //Ottengo il colore e il numero associato
                String colore = diviso[0].trim();
                int qnt = Integer.parseInt(diviso[1].trim());

                //Ora confronto le stringhe
                if (colore.equals("Rosso")) {
                    sommaRossi += qnt;
                } else if (colore.equals("Verde")) {
                    sommaVerde += qnt;
                } else if (colore.equals("Blu")) {
                    sommaBlu += qnt;
                } else if (colore.equals("Nero")) {
                    sommaNero += qnt;
                }
            }
            
        }

        // Stampo i totali
        System.out.println("Totale Rosso: " + sommaRossi);
        System.out.println("Totale Verde: " + sommaVerde);
        System.out.println("Totale Blu: " + sommaBlu);
        System.out.println("Totale Nero: " + sommaNero);

        
    }

    public static void cercaColore(ArrayList<String[]> list, String coloreDaCercare)
    {
        for(int i = 0; i< list.size(); i++)
        {   
            //ottengo l'array
            String[] arr = list.get(i);
            for (String stringa : arr) {

                String[] diviso = stringa.split(":");

                String colore = diviso[0].trim();
                int qnt = Integer.parseInt(diviso[1].trim());

                if(coloreDaCercare.equals(colore))
                {
                    if (qnt > 0 ) {
                        System.out.println("La spedizione numero " + i + " ha almeno un colore");
                        break;
                        
                    }
                    else
                    {
                        System.out.println("Non ci sono spedizioni con quel colore");
                    }
                }


                
            }
            
        }
    }
    
}
