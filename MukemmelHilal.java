import java.util.Scanner;
public class MukemmelHilal {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
		int sayi=0, top=0, x;
		System.out.print("\n Girdiðin sayýya göre mükemmel olup olmadýðýný söyleyeceðim :) \n Sayý= ");
		sayi = gir.nextInt( );
	/*	for (x=1; x<sayi; x++) 
		{if(sayi % x == 0) {top+= x;} }
		if (sayi == top) {System.out.println(" MÜKEMMELsin!");} 
		else {System.out.println(" Üzgünüm... MÜKEMMEL olmak için daha fazla çabalamalýsýn.");} */
		
		//____________WHILE ÝLE______________
		x=1; 
		while(x<sayi)
		{		
			x++; 
			if(sayi%x == 0) {top+=x; break;} 
		}
		
		if(sayi==top) {System.out.println(" MÜKEMMELsin!");} 	
		else {System.out.println(" Üzgünüm... MÜKEMMEL olmak için daha fazla çabalamalýsýn."); }
		
		
	}

}
