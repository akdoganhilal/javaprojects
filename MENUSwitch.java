import java.util.Scanner;
public class MENUSwitch {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
		String kayitlikullaniciad="asd";
		int kayitlikullanicisifre=111, islem=0;
		System.out.print("\n Kullan�c� ad�n�z= ");
		String kullaniciad = gir.next();
		System.out.print(" �ifreniz= ");
		int kullanicisifre = gir.nextInt();
		if (kullaniciad.equals(kayitlikullaniciad) & kullanicisifre == kayitlikullanicisifre)
		{
			System.out.println(" Giri� Ba�ar�l�! \n");	
		
		while (islem!=5) 
			{
			System.out.println(" (1) Anasayfa  |  (2) Hakk�nda  |  (3) �r�nler  |  (4) �leti�im  |  (5) Sistemden ��k��");
			System.out.print("\n ��lem Se�iniz= ");
			islem = gir.nextInt();
					
			switch(islem){	
			case 1: System.out.println("\n ANASAYFADASINIZ! \n"); break;
			case 2: System.out.println("\n Merhaba, ben "+kayitlikullaniciad+". 21 Ya��nda �niversite ��rencisiyim. \n"); break;
			case 3: System.out.println("\n Hen�z �r�n�n�z yok. \n"); break;
			case 4: System.out.println("\n Telefon numaras�: 05001234567 -- E-Posta: miv@miv.com \n"); break;
			case 5: System.out.println("\n Sistemden ��k�ld�. �yi g�nler dileriz! \n"); break;
			default: System.out.println("\n Ge�ersiz i�lem! \n"); break;} 
			}
		}
		else if (!(kullaniciad.equals(kayitlikullaniciad)) | kullanicisifre != kayitlikullanicisifre) {System.out.println(" Ge�ersiz Bilgi!");}
	}
}