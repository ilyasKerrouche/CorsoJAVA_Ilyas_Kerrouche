using System;
using System.Security.Cryptography.X509Certificates;

class Program 
{
    static void Main(string[] args)
    {
        //esercizio1();
        //esercizio2();

        // Console.WriteLine("Inserisci nome bambola: ");
        // string nomeInput = Console.ReadLine();

        // Console.WriteLine("Inserisci materiale");
        // string materialeInput = Console.ReadLine();

        // Console.WriteLine("Inserisci prezzo di produzione");
        // string produzioneInput = Console.ReadLine();

        // Console.WriteLine("Inserisci prezzo di vendita");
        // string venditaInput = Console.ReadLine();
        
        Giocattolo giocattolo = new Giocattolo("Bambola", "Plastica", 2, 3);
        
        List<Giocattolo> listaGiocattoli = new List<Giocattolo>();

        listaGiocattoli.Add(giocattolo);

        foreach (Giocattolo x in listaGiocattoli)
        {
            Console.WriteLine($"Nome: {x.Nome} \n Materiale: {x.Materiale} \n P.produzione: {x.Produzione} \n P.vendita: {x.Vendita}");
        }

        profitto(listaGiocattoli);

    }

    public static void esercizio1()
    {
        int selected = 0;
        List<int> listaNumeri = new List<int>();

        while(true)
        {
            Console.Write("Inserisci un numero (1 per uscire)!");

            string inputNumero = Console.ReadLine();

            if(int.TryParse(inputNumero, out selected))
            {
                if(selected == 1)
                {
                    break;
                }

                listaNumeri.Add(selected);

                if((selected % 2) == 0)
                {
                    Console.WriteLine("Numero pari");
                }
                else
                {
                    Console.WriteLine("Numero dispari");
                }
            }

        }

        int scelta;

        Console.WriteLine("VUOI STAMPARE I NUMERI? PREMI 1 PER PARI 2 PER DISPARI");
        string selezione = Console.ReadLine();

        if(int.TryParse(selezione, out scelta))
        {
            if(scelta == 1)
            {
                foreach (int x in listaNumeri)
                {
                    if((x % 2) == 0)
                {

                    Console.WriteLine($"Il numero {x} è pari!");

                }
                }
            }else if(scelta == 2)
            {
                foreach (int x in listaNumeri)
                {
                    if((x % 2) == 0)
                    {

                    Console.WriteLine($"Il numero {x} è pari!");

                    }
                }
            }
        }
    }

    public static void esercizio2()
    {
        Console.WriteLine("Inserisci una frase");
        string frase = Console.ReadLine();

        
        String[] arrayParole = frase.Split(' ');

        int conteggio = arrayParole.Length;

        foreach (string x in arrayParole)
        {
            if(x == "")
            {
                conteggio -= 1;
            }
        }

        Console.WriteLine($"Ci sono {conteggio} parole nella frase");
        
    }
    
    public static void profitto(List<Giocattolo> lista)
    {

        decimal totaleProd = 0;
        decimal totaleVend = 0;

        decimal profitto;

        foreach (Giocattolo giocattolo2 in lista)
            {
                totaleProd += giocattolo2.Produzione;
                totaleVend += giocattolo2.Vendita;
            }

        profitto = totaleProd - totaleVend;

        if(profitto >= 0)
        {
            Console.WriteLine($"Totale profitto; {profitto}");
        }else
        {
            Console.WriteLine($"Sei in negativo: {profitto}");
        }


    }

}

public class Giocattolo
{
    public string Nome {get;set;}
    public string Materiale {get;set;}

    public decimal Produzione {get;set;}

    public decimal Vendita {get;set;}

    public Giocattolo(string nome, string materiale, decimal produzione, decimal vendita)
    {
        Nome = nome;
        Materiale = materiale;
        Produzione = produzione;
        Vendita =  vendita;
    }

}



