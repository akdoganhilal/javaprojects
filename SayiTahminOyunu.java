import java.util.Scanner;
public class SayiTahminOyunu {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);	
		int hak = 10, tahm = 0;
        int sayi = (int)(Math.random()*1024);
        System.out.print("\n Bilgisayarýn tuttuðu sayýyý tahmin etmek için 10 hakkýnýz var.\n Sayý giriniz = " ); 
        tahm = gir.nextInt();
        
        for (int i = hak; i > 1; i--)
        { 
	        if(tahm < 1 || tahm > 1024 ) 
	        {	System.out.print("\n Hatalý giriþ! Kalan hak = " + --hak + ". 1 ile 1024 arasýnda bir deðer giriniz= ");
	        	tahm = gir.nextInt();	}
	        
	        else if (tahm == sayi) 
	        {	System.out.println("\n Bildiniz! \n");  
	        	tahm = gir.nextInt();	} 
	            
	        else if (tahm < sayi) 
	        {	System.out.print(" Küçük! Kalan hak = " + --hak + ". Daha büyük bir sayý giriniz= "); 
	        	tahm = gir.nextInt();	}
	      
	        else if (tahm > sayi) 
	        {	System.out.print(" Büyük! Kalan hak = " + --hak + ". Daha küçük bir sayý giriniz= "); 
	        	tahm = gir.nextInt();	}
        }
        System.out.println("\n Bilemediniz! Bilgisayarýn tuttuðu sayý = "+sayi+" Tekrar deneyiniz.");
	
	}
}