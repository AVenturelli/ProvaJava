package com.example.arraynomi;
import com.terzo.Terzo;

import java.util.ArrayList;

public class Arraynomi {
    private ArrayList<Terzo> NomiVari;
    private int numeroNomi;
    public Arraynomi()
    {
        numeroNomi = 0;
        NomiVari = new ArrayList<>(1);
    }
    public void aggiungiNome(String x, String y)
    {
            NomiVari.add(numeroNomi,new Terzo());
            NomiVari.get(numeroNomi).settaNome(x,y);
        numeroNomi++;
    }
    public void print()
    {
        numeroNomi--;
       for(int i = 0; i <= numeroNomi; i++) {
           NomiVari.get(i).print();
       }
    }
}
