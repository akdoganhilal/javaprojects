import java.util.Scanner;
public class FORArmstrongSayi {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
		int sayi, bir, on, yuz, bin, sonuc, topla = 0, topla2 = 0;
		System.out.print(" \n Sayý giriniz= ");
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
        		{ System.out.println(" "+sonuc+" sayýsý Armstrong sayýsýdýr."); }
	        else if(sonuc>999 & sonuc<=9999 & topla2==sonuc) 
	        	{ System.out.println(" "+sonuc+" sayýsý Armstrong sayýsýdýr."); }
	        else if(sonuc>=10 & sonuc<=99) 
	        	{ System.out.println(" Ýki basamaklý Armstrong sayýsý bulunmamaktadýr."); }
	        else if(sonuc>9999) 
	        	{ System.out.println(" Daha küçük bir sayý giriniz."); }
	        else if(sonuc<0) 
	        	{ System.out.println(" Daha büyük bir sayý giriniz."); }
	        else 
	        	{ System.out.println(" "+sonuc+" sayýsý Armstrong sayýsý deðildir."); }
		
	        System.out.println(" \n Armstrong Sayýlarý ");	
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