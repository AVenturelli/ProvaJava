package com.terzo;

public class Terzo {
        private String Nome;
        private String Cognome;
        public Terzo (){
                Nome = "";
                Cognome = "";
        }
        public  void settaNome(String x, String y)
        {
                Nome = x;
                Cognome = y;
        }
        public void invertiNomi()
        {
                String a = Nome;
                Nome = Cognome;
                Cognome = a;

        }
        public void print()
        {
                System.out.println("Nome:"+ Nome);
                System.out.println("Cognome:"+Cognome);
        }
        public void set(Terzo x)
        {
                return;
        }
}
