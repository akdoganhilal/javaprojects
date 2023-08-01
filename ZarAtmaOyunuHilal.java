package com.mycompany.zaratmaoyunuhilal;

public class ZarAtmaOyunuHilal {

    public static void main(String[] args) {
       int bir=0, iki=0, uc=0, dort=0, bes=0, alti=0;
        for (int i=1;i<=100;i++) 
	{
             int sayi = (int) (Math.random()*6+1);
             System.out.println( "Atılan zar: " + (sayi));       
             if (sayi==1)
             {      
                 bir++;
                 System.out.println("1 sayısı " + bir + " kere denk geldi.");
             }
             if (sayi==2)
             {      
                 iki++;
                 System.out.println("2 sayısı " + iki + " kere denk geldi.");
             }
             if (sayi==3)
             {      
                 uc++;
                 System.out.println("3 sayısı " + uc + " kere denk geldi.");
             }
             if (sayi==4)
             {      
                 dort++;
                 System.out.println("4 sayısı " + dort + " kere denk geldi.");
             }
             if (sayi==5)
             {      
                 bes++;
                 System.out.println("5 sayısı " + bes + " kere denk geldi.");
             }
             if (sayi==6)
             {      
                 alti++;
                 System.out.println("6 sayısı " + alti + " kere denk geldi.");
             }   
        }
    }
}
