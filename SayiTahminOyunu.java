import java.util.Scanner;
public class SayiTahminOyunu {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);	
		int hak = 10, tahm = 0;
        int sayi = (int)(Math.random()*1024);
        System.out.print("\n Bilgisayar�n tuttu�u say�y� tahmin etmek i�in 10 hakk�n�z var.\n Say� giriniz = " ); 
        tahm = gir.nextInt();
        
        for (int i = hak; i > 1; i--)
        { 
	        if(tahm < 1 || tahm > 1024 ) 
	        {	System.out.print("\n Hatal� giri�! Kalan hak = " + --hak + ". 1 ile 1024 aras�nda bir de�er giriniz= ");
	        	tahm = gir.nextInt();	}
	        
	        else if (tahm == sayi) 
	        {	System.out.println("\n Bildiniz! \n");  
	        	tahm = gir.nextInt();	} 
	            
	        else if (tahm < sayi) 
	        {	System.out.print(" K���k! Kalan hak = " + --hak + ". Daha b�y�k bir say� giriniz= "); 
	        	tahm = gir.nextInt();	}
	      
	        else if (tahm > sayi) 
	        {	System.out.print(" B�y�k! Kalan hak = " + --hak + ". Daha k���k bir say� giriniz= "); 
	        	tahm = gir.nextInt();	}
        }
        System.out.println("\n Bilemediniz! Bilgisayar�n tuttu�u say� = "+sayi+" Tekrar deneyiniz.");
	
	}
}