package com.example.primo.com.example.input;

import com.example.arraynomi.Arraynomi;

import java.util.Scanner;

public class Input {

    private Arraynomi nomi = new Arraynomi();
    private String nomeIns;
    private String cognomeIns;
    private String ins_Età;
    private Integer anni=0;

    public Input() {
        while (true) {
            System.out.println("Scrivi il nome o chiudi il programma con la parola \"Fine\"");
            Scanner input = new Scanner(System.in);
            nomeIns = input.next();
            String k = "Fine";
            if (nomeIns.equals(k)) {
                nomeIns ="";
                break;
            } else {
                System.out.println("Inserisci il cognome");
                cognomeIns = input.next();
                System.out.println("Vuoi inserire l'età? Sì o No");
                ins_Età = input.next();
                if (ins_Età.equals("Sì") || ins_Età.equals("Si") || ins_Età.equals("si") || ins_Età.equals("SI")) {
                    System.out.println("Inserisci l'età");
                    anni = input.nextInt();
                } else {
                    anni = 0;
                }
            }
            nomi.aggiungiNome(nomeIns, cognomeIns, anni);
        }
    }
    public void print()
    {
        nomi.print();
    }
}