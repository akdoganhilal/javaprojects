import java.util.Scanner;
public class EtkinlikOneren {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner (System.in);
		System.out.print("\n Hava s�cakl���n� giriniz= "); 
		int sicaklik = gir.nextInt();
		
		if(sicaklik>=30) {System.out.println(" Y�z");}
		else if(sicaklik<30 && sicaklik>5) {System.out.println(" Sinemaya git");}
		else {System.out.println(" Kayak yap");}
		
	}
}