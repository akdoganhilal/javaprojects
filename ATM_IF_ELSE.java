import java.util.Scanner;
public class ATM_IF_ELSE {
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
				
				while (bakiye>0) {	
						System.out.println(" (1)Para Yatýrma - (2)Para Çekme - (3)Bakiye Görüntüle  - (4)Sistemden Çýkýþ");
						System.out.print("\n Ýþlem Seçiniz= "); islem = gir.nextInt();
				
					if(islem==1) 
					{
						System.out.print("\n Yatýrýlacak miktar= "); miktar=gir.nextInt();
							if (miktar<0) {System.out.println(" Geçersiz deðer! \n"); }
							else {bakiye+=miktar; System.out.println(" "+miktar+" tl hesabýnýza eklenmiþtir. Bakiyeniz: "+bakiye+" tl'dir. \n"); }
					}	
					else if(islem==2) 
					{
						System.out.print(" Çekilecek miktar= "); miktar=gir.nextInt(); 
							if (miktar>bakiye) {System.out.println(" Yetersiz Bakiye! \n"); }
							else {bakiye-=miktar; System.out.println(" "+miktar+" tl hesabýnýzdan çekilmiþtir. Kalan bakiyeniz: "+bakiye+" tl'dir. \n"); }
					}	
					else if(islem==3) 
					{
						System.out.println(" Bakiyeniz: "+bakiye+" tl'dir. \n");
					}		
					
					else if(islem==4) 
					{
					System.out.println(" Sistemden çýkýldý. Ýyi günler dileriz! \n"); break;	
					}
					else {System.out.println(" Geçersiz iþlem! \n"); }
								}
																}
			else if (kartno!=kayitlikartno | sifre!=kayitlisifre) {System.out.println(" Geçersiz Bilgi!");}
			
	}
}