import java.util.Scanner;
public class FORArmstrongSayi {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
		int sayi, bir, on, yuz, bin, sonuc, topla = 0, topla2 = 0;
		System.out.print(" \n Say� giriniz= ");
		sayi = gir.nextInt();
		sonuc = sayi;	
		
			for(int x=0; x<sayi; x++)
			{ 
				bir = sayi%10;  sayi /= 10;
				on  = sayi%10; 	sayi /= 10;
				yuz = sayi%10;  sayi /= 10; 
				bin = sayi%10;  sayi /= 10;
	            topla = (bir*bir*bir)+(on*on*on)+(yuz*yuz*yuz)+(bin*bin*bin);	     
	            topla2 = (bir*bir*bir*bir)+(on*on*on*on)+(yuz*yuz*yuz*yuz)+(bin*bin*bin*bin);	  
			}
	        if 	(topla==sonuc) 
        		{ System.out.println(" "+sonuc+" say�s� Armstrong say�s�d�r."); }
	        else if(sonuc>999 & sonuc<=9999 & topla2==sonuc) 
	        	{ System.out.println(" "+sonuc+" say�s� Armstrong say�s�d�r."); }
	        else if(sonuc>=10 & sonuc<=99) 
	        	{ System.out.println(" �ki basamakl� Armstrong say�s� bulunmamaktad�r."); }
	        else if(sonuc>9999) 
	        	{ System.out.println(" Daha k���k bir say� giriniz."); }
	        else if(sonuc<0) 
	        	{ System.out.println(" Daha b�y�k bir say� giriniz."); }
	        else 
	        	{ System.out.println(" "+sonuc+" say�s� Armstrong say�s� de�ildir."); }
		
	        System.out.println(" \n Armstrong Say�lar� ");	
			for(int i=0; i<=99999; i++)
			{
				sayi=i;
				
				bin   = sayi%10;  sayi /= 10;
				yuz   = sayi%10;  sayi /= 10; 
				on    = sayi%10;  sayi /= 10;
				bir   = sayi%10;  sayi /= 10;			
				topla = (bir*bir*bir)+(on*on*on)+(yuz*yuz*yuz)+(bin*bin*bin);
				topla2 = (bir*bir*bir*bir)+(on*on*on*on)+(yuz*yuz*yuz*yuz)+(bin*bin*bin*bin);	 

			if(topla==i | topla2==i ) 
				{System.out.print(" "+i+" "); } 
			} 	
			 
	}
}