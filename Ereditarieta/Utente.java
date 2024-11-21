package Ereditarieta;

import java.util.ArrayList;

public class Utente extends Ristorante{
    
    private String nome;
    private String email;
    private float soldi;
    protected int tipoUtente;
    private static ArrayList<String[]> elencoUtenti = new ArrayList<String[]>();


    public String getNome()
    {
        return nome;
    }

    public String getMail()
    {
        return email;
    }


    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setMail(String mail)
    {
        this.email = mail;
    }

    public Utente()
    {
        this.tipoUtente = 0;
    }

    public void inserisciUtente(Utente utente)
    {
        elencoUtenti.add(new String[]{"Nome: " + utente.nome , "Mail: " + utente.email });
    }

    public static ArrayList<String[]> getElencoUtenti()
    {
        return elencoUtenti;
    }

    public static void stampaListaUtenti()
    {
        System.out.println("Elenco utenti: ");
        for (String[] arr : elencoUtenti) {
            System.out.println(arr[0] + "," + arr[1]);
            
        }
    }

    

}
