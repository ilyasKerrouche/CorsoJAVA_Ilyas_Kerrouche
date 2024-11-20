import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Biblioteca {

    public static class  Libro {

        String nomeLibro;
        int numeroPagine;
    
        public Libro(String nomeLibro, int numeroPagine)
        {
            this.nomeLibro = nomeLibro;
            this.numeroPagine = numeroPagine;
        }
    
        public String getNomelibro()
        {
            return this.nomeLibro;
        }
    
        public int getNumeroPagine()
        {
            return this.numeroPagine;
        }
    
        
    }


public static void main(String[] args)
{   
    //lista dinamici che contiene una lista di stringhe
    ArrayList<String[]> elenco = new ArrayList<>();
    Scanner scannerString = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);
    int selezionato;

do{
    menu();

    selezionato = scannerInt.nextInt();


    switch (selezionato) {
        case 1:
            System.out.println("Inserisci nome libro");
            String nomeInserito = scannerString.nextLine();
        
            System.out.println("Inserisci numero pagine del libro");
            int nPag = scannerInt.nextInt();

            Libro libro1 = new Libro(nomeInserito, nPag);
        
            elenco.add(new String[]{"Nome libro: " + libro1.getNomelibro(), "Numero pagine: " + libro1.getNumeroPagine()});
            break;
        
        case 2:
            restituisciListaLibri(elenco);

        break;

        case 3:
            getNumeroTotLibro(elenco);
            break;

        case 4:
            cercaLibro(elenco);
            break;

        case 5:
            cercaMaxPagine(elenco);
            break;
            
        case 6:
        break;          
        }
}while(selezionato != 6);


    scannerInt.close();
    scannerString.close();

}

public static void menu()
{
    {
        System.out.println("Scegliere opzione (1,2,3,4): ");
        System.out.println("1.Aggiungi libro");
        System.out.println("2.Mostra elenco libri");
        System.out.println("3.Stampa totale libri");
        System.out.println("4.Cerca libro tramite nome");
        System.out.println("5.Cerca libro tramite numero max pagine");
        System.out.println("6.Exit");
    }
}

public static void restituisciListaLibri(ArrayList<String[]> list)
{

    for (String[] arr : list) {
    
        System.out.println(Arrays.toString(arr));
        
        
    }

}

public static void getNumeroTotLibro(ArrayList<String[]> list)
{
    int totLibri = 0;

    for (String[] arr : list) {

        
        String numeroPagineString = arr[1];
        String[] divisore = numeroPagineString.split(":");

        totLibri += Integer.parseInt(divisore[1].trim());

        
        
    }
    System.out.println("Totale pagine: " + totLibri);
        
}

public static void cercaLibro(ArrayList<String[]> list){

    Scanner myscan = new Scanner(System.in);

    System.out.println("Inserisci il nome del libro che vuoi cercare");
    String nomeLibroLooking = myscan.nextLine();

    for (String[] arr : list) {
        for (String string : arr) {

            String[] divisore = string.split(":");

            String nomeInArray = divisore[1].trim();

            if(nomeLibroLooking.equals(nomeInArray))
            {
                System.out.println("Libro trovato");
                System.out.println(Arrays.toString(arr));
                return;
            }          
        }
        
    }

    myscan.close();

}

public static void cercaMaxPagine(ArrayList<String[]> list)
{
    Scanner myscan = new Scanner(System.in);

    System.out.println("Inserisci il numero di pagine massime");
    int numeroPagineMax = myscan.nextInt();

    for (String[] arr : list) {
        String secondoInArray= arr[1];
        
        String[] divisore = secondoInArray.split(":");

        int nPagineInArray = Integer.parseInt(divisore[1].trim());

        if(nPagineInArray <= numeroPagineMax)
        {
            System.out.println(Arrays.toString(arr));
        }

        
        
    }
    myscan.close();
}

}
