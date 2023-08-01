import java.util.Scanner;
public class ATMswitch {
	public static void main(String[] args) {

		Scanner gir = new Scanner(System.in);
		int kayitlikartno=1, kayitlisifre=2;
		System.out.print("\n Hilal Bankasýna Hoþgeldiniz. \n Kart Numaranýz= ");
		int kartno = gir.nextInt();
		System.out.print(" Þifreniz= ");
		int sifre = gir.nextInt();
		
			if (kartno==kayitlikartno & sifre==kayitlisifre){System.out.println(" Giriþ Baþarýlý! \n");	
				int bakiye = 3500;
				int islem=0, miktar=0;	
				
				while (islem!=4) {	
						System.out.println(" (1) Bakiye Görüntüle");
						System.out.println(" (2) Para Yatýrma");
						System.out.println(" (3) Para Çekme");
						System.out.println(" (4) Sistemden Çýkýþ");
						System.out.print("\n Ýþlem Seçiniz= ");
						islem = gir.nextInt();
				
					switch(islem){	
						case 1: System.out.println(" Bakiyeniz: "+bakiye+" tl'dir. \n"); break;
						case 2: System.out.print("\n Yatýrýlacak miktar= "); miktar=gir.nextInt(); 
							if (miktar<0) {System.out.println(" Geçersiz deðer! \n"); break;}
							else {bakiye+=miktar; System.out.println(" "+miktar+" tl hesabýnýza eklenmiþtir. Bakiyeniz: "+bakiye+" tl'dir. \n"); break;}
						case 3: System.out.print(" Çekilecek miktar= "); miktar=gir.nextInt(); 
							if (miktar>bakiye) {System.out.println(" Yetersiz Bakiye! \n"); break;}
							else {bakiye-=miktar; System.out.println(" "+miktar+" tl hesabýnýzdan çekilmiþtir. Kalan bakiyeniz: "+bakiye+" tl'dir. \n"); break;}			
						case 4: System.out.println(" Sistemden çýkýldý. Ýyi günler dileriz! \n"); break;
						default: System.out.println(" Geçersiz iþlem! \n"); break;} 
							   }	
															}	
			else if (kartno!=kayitlikartno | sifre!=kayitlisifre) {System.out.println(" Geçersiz Bilgi!");}
			System.out.println(" -Hilal Akdoðan");
	}
}