import java.util.Scanner;
public class KDVhesapla {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
		double tutar, kdvlifiyat, kdv=0.18, kdvsizfiyat; 
		System.out.print("\n Ürün tutarýný giriniz= "); 
		tutar = gir.nextDouble();
		kdvlifiyat = tutar + (tutar*kdv);
		System.out.println(" Ürünün KDV'li tutarý: "+kdvlifiyat);
		
		System.out.print(" KDV dahil ürün tutarýný giriniz= "); 
		tutar = gir.nextDouble();
		kdvsizfiyat = tutar/(1+kdv);
		System.out.println(" KDV hariç ürün tutarý: "+kdvsizfiyat);

	}
}