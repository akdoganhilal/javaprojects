import java.util.Scanner; 
public class Burclar {
	 public static void main(String[] args) {
			 
		Scanner gir = new Scanner(System.in);
		int gun; String ay;
		System.out.print("\n Do�um tarihinizin g�n de�erini ve ay�n� giriniz= ");
		gun=gir.nextInt();
		ay=gir.next(); 
  

	   if		((gun>=21 & ay.equalsIgnoreCase("ocak")==true)    | (gun<=19 & ay.equalsIgnoreCase("�ubat")==true))
		   		System.out.println(" Burcunuz= Kova");
	   else if	((gun>=20 & ay.equalsIgnoreCase("�ubat")==true)   | (gun<=20 & ay.equalsIgnoreCase("mart")==true))
		   		System.out.println(" Burcunuz= Bal�k");
	   else if	((gun>=21 & ay.equalsIgnoreCase("mart")==true)    | (gun<=20 & ay.equalsIgnoreCase("nisan")==true))
		   		System.out.println(" Burcunuz= Ko�");
	   else if	((gun>=21 & ay.equalsIgnoreCase("nisan")==true)   | (gun<=20 & ay.equalsIgnoreCase("may�s")==true))
		   		System.out.println(" Burcunuz= Bo�a");
	   else if	((gun>=21 & ay.equalsIgnoreCase("may�s")==true)   | (gun<=21 & ay.equalsIgnoreCase("haziran")==true))
		   		System.out.println(" Burcunuz= �kizler");
	   else if	((gun>=22 & ay.equalsIgnoreCase("haziran")==true) | (gun<=23 & ay.equalsIgnoreCase("temmuz")==true))
		   		System.out.println(" Burcunuz= Yenge�");
	   else if	((gun>=24 & ay.equalsIgnoreCase("temmuz")==true)  | (gun<=23 & ay.equalsIgnoreCase("a�ustos")==true))
		   		System.out.println(" Burcunuz= Aslan"); 
	   else if	((gun>=24 & ay.equalsIgnoreCase("a�ustos")==true) | (gun<=23 & ay.equalsIgnoreCase("eyl�l")==true))
		   		System.out.println(" Burcunuz= Ba�ak"); 
	   else if	((gun>=24 & ay.equalsIgnoreCase("eyl�l")==true)   | (gun<=23 & ay.equalsIgnoreCase("ekim")==true))
		   		System.out.println(" Burcunuz= Terazi");
	   else if	((gun>=24 & ay.equalsIgnoreCase("ekim")==true)    | (gun<=22 & ay.equalsIgnoreCase("kas�m")==true))
		   		System.out.println(" Burcunuz= Akrep");
	   else if	((gun>=23 & ay.equalsIgnoreCase("kas�m")==true)   | (gun<=21 & ay.equalsIgnoreCase("aral�k")==true))
		   		System.out.println(" Burcunuz= Yay");
	   else if	((gun>=22 & ay.equalsIgnoreCase("aral�k")==true)  | (gun<=20 & ay.equalsIgnoreCase("ocak")==true))
		   		System.out.println(" Burcunuz= O�lak");
	
	   else {System.out.println("Yanl�� de�er girdiniz! Tekrar deneyiniz.");}  


 }
}