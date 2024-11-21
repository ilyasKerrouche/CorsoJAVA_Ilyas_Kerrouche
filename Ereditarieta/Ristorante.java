package Ereditarieta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ristorante {
    
    
    static ArrayList<String[]> piatti = new ArrayList<String[]>();
    static ArrayList<String[]> ValutazionePiatti = new ArrayList<String[]>();

    
    public void addPiatto()
    {
        System.out.println("Metodo addPiatto nella classe Ristorante (implementazione di base)");
    }

        
    public void addRecensione()
    {
        System.out.println("Metodo addRece nella classe Ristorante (implementazione di base)");
    }
    
    public static void main(String[] args){
        
        int selezionato;
    

        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Utente utente = new Utente();




        do{

            menu();

            selezionato = scannerInt.nextInt();

            switch (selezionato) {
                case 1: //aggiungo utente
                            //creo l'utente
                    System.out.println("Inserisci nome utente :");
                    utente.setNome(scannerString.nextLine());

                    System.out.println("Inserisci mail :");
                    utente.setMail(scannerString.nextLine());

                    utente.inserisciUtente(utente);

                    
                    
                    System.out.println("cosa vuoi fare? ");
                    System.out.println("1.STAMPA LISTA UTENTI");
                    System.out.println("2.ESCI");
                    int selected = scannerInt.nextInt();
                    
                    switch (selected) {
                        case 1:
                        Utente.stampaListaUtenti();
                        break;
                        case 2:
                            break;
                    }
                    
                    break;
                case 2: //login

                    System.out.println("Inserisci la parola chiave: ");
                    String pass = scannerString.nextLine();
                    checkPass(pass, utente);
                    break;
                
                case 3:

            }
        }while(selezionato != 3);


        scannerString.close();
    }



    public static void menu()
    {
        System.out.println("1. INSERISCI UTENTE");
        System.out.println("2. STAMPA LISTA UTENTI");
        System.out.println("3. AGGIUNGI FILM");
        System.out.println("4. LOGIN");
        System.out.println("5. Noleggio film");
        System.out.println("6. Mostro film noleggiati");
        System.out.println("7. EXIT");

    }

    public static void checkPass(String pass, Utente utente)
    {
        
        Scanner scannPiatto = new Scanner(System.in);
        if(pass.equals("Chef"))
        {
            Chef chef = new Chef();

            //Passo le info dell'utente all'oggetto chef
            chef.setNome(utente.getNome());
            chef.setMail(utente.getMail());

            // Chiamata alla funz. addPiatto nella classe chef
            chef.addPiatto();
            scannPiatto.close();

            
        }else if(pass.equals("Critico"))
        {
            Critico critico = new Critico();

            //Passo le info dell'utente all'oggetto critico
            critico.setNome(utente.getNome());
            critico.setMail(utente.getMail());
            
            // Chiamata alla funz. addRecensione nella classe chef
            critico.addRecensione();
        }else
        {
            System.out.println("PASSWORD ERRATA!");
        }
    }

    public static void getListaPiatti()
    {
        for (String[] arr : piatti) {
            System.out.println(Arrays.toString(arr));
            
        }
    }    
    
    
}
