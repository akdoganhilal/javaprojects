package com.mycompany.hesapmakinesihilal;
import java.util.Scanner;

public class HesapMakinesiHilal {
    public static void main(String[] args) {
        	Scanner gir= new Scanner(System.in);
		double s1, s2, is; 

			System.out.print("\n Birinci sayı= ");
			s1=gir.nextInt(); 
			System.out.print("\n İkinci sayı= ");
			s2=gir.nextInt(); 
			System.out.print("\n İşlem seçiniz: (1)Toplama - (2)Çıkarma - (3)Çarpma - (4)Bölme - (5)Mod - (6)Tüm İşlemleri Yap= ");
			is=gir.nextInt(); 

			if(is==1){ System.out.println("\n Toplama işleminin sonucu = " + (s1+s2)); }
			else if(is==2){ System.out.println("\n Çıkarma işleminin sonucu = " + (s1-s2)); }
			else if(is==3){ System.out.println("\n Çarpma işleminin sonucu = " + (s1*s2)); }
			else if(is==4){ System.out.println("\n Bölme işleminin sonucu = " + (s1/s2)); }
			else if(is==5){ System.out.println("\n Bölme işleminden kalan sonucu = " + (s1%s2)); } 
			else if(is==6){ System.out.println("\n Tüm işlemler yapılmıştır. \n Toplama işleminin sonucu = " + (s1+s2) + 
					"\n Çıkarma işleminin sonucu = " + (s1-s2) + "\n Çarpma işleminin sonucu = " + (s1*s2) + 
					"\n Bölme işleminin sonucu = " + (s1/s2) + "\n Bölme işleminden kalan sonucu = " + (s1%s2));}
			else System.out.println("\n Hatalı giriş!");
    }
}
