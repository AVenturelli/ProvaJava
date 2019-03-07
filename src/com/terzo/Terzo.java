package com.terzo;

public class Terzo {
        private String Nome;
        private String Cognome;
        private int Età;
        public Terzo (){
                Nome = "";
                Cognome = "";
                Età = 0;
        }
        public  void settaNome(String x, String y, int a)
        {
                Nome = x;
                Cognome = y;
                Età = a;
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
                if (Età != 0){
                        System.out.println("Età:"+ Età);
                }
                System.out.println("\n");

        }
        public void set(Terzo x)
        {
                return;
        }
}
