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
        for (int i = 0; i<3; i++)
        {
            System.out.println("Scrivi il nome o esci con la parola \"Fine\"");
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
                Nomi.aggiungiNome(NomeIns, CognomeIns);
            }
        }
        Nomi.print();


        /*for(int i = 0; i<uno.raddoppia() ; i++) {
            System.out.println("Hello, World!");
        }*/
    }
}