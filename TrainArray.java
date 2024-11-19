import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TrainArray {
    
    public static void main(String[] args)
    {
        ArrayList<String[]> elenco = new ArrayList<String[]>();
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        ArrayList<Integer> listaInteri = new ArrayList<Integer>();

        System.out.println("Inserisci un nome: ");
        String nome = scannerString.nextLine();

        System.out.println("Inserisci eta: ");
        int eta = scannerInt.nextInt();

        //aggiungo un nuovo array di tipo stringo al mio array dinamcio
        elenco.add(new String[]{"Nome: " + nome, "Eta: " + String.valueOf(eta)});


        //STAMPA

        //Stampo ogni stringa dell'array di stringhe
        for (int i=0; i<elenco.size();i++) {

            String[] arr = elenco.get(i);
            System.out.println("Elenco numero " + i + " :");
            for (String string : arr) {
                System.out.print(string.toString() + " ");
                
            }
        }

        //Stampoo ogni array:
        for (String[] iterable_element : elenco) {
            System.out.println(Arrays.toString(iterable_element));
            
        }


        listaInteri.add(1);
        listaInteri.add(2);
        listaInteri.add(6);
        
        // System.out.println(listaInteri.toString());
        // System.out.println(elenco.toString());





        scannerString.close();
        scannerInt.close();

    }
}
