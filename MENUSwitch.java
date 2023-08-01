import java.util.Scanner;
public class MENUSwitch {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
		String kayitlikullaniciad="asd";
		int kayitlikullanicisifre=111, islem=0;
		System.out.print("\n Kullanýcý adýnýz= ");
		String kullaniciad = gir.next();
		System.out.print(" Þifreniz= ");
		int kullanicisifre = gir.nextInt();
		if (kullaniciad.equals(kayitlikullaniciad) & kullanicisifre == kayitlikullanicisifre)
		{
			System.out.println(" Giriþ Baþarýlý! \n");	
		
		while (islem!=5) 
			{
			System.out.println(" (1) Anasayfa  |  (2) Hakkýnda  |  (3) Ürünler  |  (4) Ýletiþim  |  (5) Sistemden Çýkýþ");
			System.out.print("\n Ýþlem Seçiniz= ");
			islem = gir.nextInt();
					
			switch(islem){	
			case 1: System.out.println("\n ANASAYFADASINIZ! \n"); break;
			case 2: System.out.println("\n Merhaba, ben "+kayitlikullaniciad+". 21 Yaþýnda üniversite öðrencisiyim. \n"); break;
			case 3: System.out.println("\n Henüz ürününüz yok. \n"); break;
			case 4: System.out.println("\n Telefon numarasý: 05001234567 -- E-Posta: miv@miv.com \n"); break;
			case 5: System.out.println("\n Sistemden çýkýldý. Ýyi günler dileriz! \n"); break;
			default: System.out.println("\n Geçersiz iþlem! \n"); break;} 
			}
		}
		else if (!(kullaniciad.equals(kayitlikullaniciad)) | kullanicisifre != kayitlikullanicisifre) {System.out.println(" Geçersiz Bilgi!");}
	}
}