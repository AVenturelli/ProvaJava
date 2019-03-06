package com.example.primo;
import com.terzo.Terzo;
import com.example.secondo.Secondo;

import java.util.Scanner;
import com.example.arraynomi.Arraynomi;
public class Primo {
    public static void main(String[] args) {

        //Secondo uno = new Secondo(1);
        //uno.printNumero();
        //uno.printStr();

        Arraynomi Nomi = new Arraynomi();
        while(true)
        {
            System.out.println("Scrivi il nome o chiudi il programma con la parola \"Fine\"");
            Scanner input = new Scanner(System.in);
            String NomeIns = input.next();
            String k = "Fine";
            if(NomeIns.equals(k))
            {
                break;
            }
            else {
                System.out.println("Inserisci il cognome");
                String CognomeIns = input.next();
                System.out.println("Vuoi inserire l'età? Sì o No");
                String Età = input.next();
                int anni;
                if(Età.equals("Sì") || Età.equals("Si") || Età.equals("si")|| Età.equals("SI") )
                {
                    System.out.println("Inserisci l'età");
                    anni = input.nextInt();
                }
                else
                {
                    anni = 0;
                }
                Nomi.aggiungiNome(NomeIns, CognomeIns, anni);
            }
        }
        Nomi.print();


        /*for(int i = 0; i<uno.raddoppia() ; i++) {
            System.out.println("Hello, World!");
        }*/
    }
}