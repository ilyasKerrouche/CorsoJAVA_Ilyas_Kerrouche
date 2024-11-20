import java.util.ArrayList;
import java.util.Arrays;

public class Squadra {
    
    
    public static class Giocatore {
        
        String nome;
        int ruolo;
        
        public Giocatore(String nome, int ruolo){
            
            this.nome = nome;
            this.ruolo = ruolo;
            
        }

        public String getNome()
        {
            return this.nome;
        }

        public int getRuolo()
        {
            return this.ruolo;
        }
    }


    
    
    public static void main(String[] args)
    {
        ArrayList<String[]> giocatori = new ArrayList<String[]>();
    
        String[] nomi = {"Luca", "Sara", "Giulia", "Marco", "Elena", "Matteo", "Francesca","Davide", "Alessia", "Andrea"};
        int[] ruolo = {1,2,3,4,5,6,7,8,9,10,11,12};


        
        
        for(int i = 0; i<=12; i++)
        {

            int random = (int)Math.floor(Math.random() * 12);
            String nomeEstratto = nomi[random];
            int ruoloEstratto = ruolo[random]; 

            Giocatore giocatore = new Giocatore(nomeEstratto, ruoloEstratto);

            giocatori.add(new String[]{"Nome: " + giocatore.getNome(), "Ruolo: " + giocatore.getRuolo()});


            
        }

        for (String[] arr : giocatori) {
            System.out.println(Arrays.toString(arr));
            
        }
    }

    public static void checkNome(ArrayList<String[]> list, String[] listaNomi)
    {
        for (String[] arr : list) {
            
            
        }
    }
}
