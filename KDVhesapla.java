import java.util.Scanner;
public class KDVhesapla {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
		double tutar, kdvlifiyat, kdv=0.18, kdvsizfiyat; 
		System.out.print("\n �r�n tutar�n� giriniz= "); 
		tutar = gir.nextDouble();
		kdvlifiyat = tutar + (tutar*kdv);
		System.out.println(" �r�n�n KDV'li tutar�: "+kdvlifiyat);
		
		System.out.print(" KDV dahil �r�n tutar�n� giriniz= "); 
		tutar = gir.nextDouble();
		kdvsizfiyat = tutar/(1+kdv);
		System.out.println(" KDV hari� �r�n tutar�: "+kdvsizfiyat);

	}
}