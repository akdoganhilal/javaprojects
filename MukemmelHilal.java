import java.util.Scanner;
public class MukemmelHilal {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
		int sayi=0, top=0, x;
		System.out.print("\n Girdi�in say�ya g�re m�kemmel olup olmad���n� s�yleyece�im :) \n Say�= ");
		sayi = gir.nextInt( );
	/*	for (x=1; x<sayi; x++) 
		{if(sayi % x == 0) {top+= x;} }
		if (sayi == top) {System.out.println(" M�KEMMELsin!");} 
		else {System.out.println(" �zg�n�m... M�KEMMEL olmak i�in daha fazla �abalamal�s�n.");} */
		
		//____________WHILE �LE______________
		x=1; 
		while(x<sayi)
		{		
			x++; 
			if(sayi%x == 0) {top+=x; break;} 
		}
		
		if(sayi==top) {System.out.println(" M�KEMMELsin!");} 	
		else {System.out.println(" �zg�n�m... M�KEMMEL olmak i�in daha fazla �abalamal�s�n."); }
		
		
	}

}
