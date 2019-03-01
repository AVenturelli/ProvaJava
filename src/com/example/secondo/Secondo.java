package com.example.secondo;

public class Secondo {
    private int valore;
    private String str;

    public Secondo(int x)
    {
        valore = x+1;
        str="Stringa di Base";
    }
    public int raddoppia()
    {
        return valore*2;
    }
    public void printStr()
    {
        System.out.println(str);
    }
    public void printNumero()
    {
        System.out.println(valore);
    }
}
