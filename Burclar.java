import java.util.Scanner; 
public class Burclar {
	 public static void main(String[] args) {
			 
		Scanner gir = new Scanner(System.in);
		int gun; String ay;
		System.out.print("\n Doðum tarihinizin gün deðerini ve ayýný giriniz= ");
		gun=gir.nextInt();
		ay=gir.next(); 
  

	   if		((gun>=21 & ay.equalsIgnoreCase("ocak")==true)    | (gun<=19 & ay.equalsIgnoreCase("þubat")==true))
		   		System.out.println(" Burcunuz= Kova");
	   else if	((gun>=20 & ay.equalsIgnoreCase("þubat")==true)   | (gun<=20 & ay.equalsIgnoreCase("mart")==true))
		   		System.out.println(" Burcunuz= Balýk");
	   else if	((gun>=21 & ay.equalsIgnoreCase("mart")==true)    | (gun<=20 & ay.equalsIgnoreCase("nisan")==true))
		   		System.out.println(" Burcunuz= Koç");
	   else if	((gun>=21 & ay.equalsIgnoreCase("nisan")==true)   | (gun<=20 & ay.equalsIgnoreCase("mayýs")==true))
		   		System.out.println(" Burcunuz= Boða");
	   else if	((gun>=21 & ay.equalsIgnoreCase("mayýs")==true)   | (gun<=21 & ay.equalsIgnoreCase("haziran")==true))
		   		System.out.println(" Burcunuz= Ýkizler");
	   else if	((gun>=22 & ay.equalsIgnoreCase("haziran")==true) | (gun<=23 & ay.equalsIgnoreCase("temmuz")==true))
		   		System.out.println(" Burcunuz= Yengeç");
	   else if	((gun>=24 & ay.equalsIgnoreCase("temmuz")==true)  | (gun<=23 & ay.equalsIgnoreCase("aðustos")==true))
		   		System.out.println(" Burcunuz= Aslan"); 
	   else if	((gun>=24 & ay.equalsIgnoreCase("aðustos")==true) | (gun<=23 & ay.equalsIgnoreCase("eylül")==true))
		   		System.out.println(" Burcunuz= Baþak"); 
	   else if	((gun>=24 & ay.equalsIgnoreCase("eylül")==true)   | (gun<=23 & ay.equalsIgnoreCase("ekim")==true))
		   		System.out.println(" Burcunuz= Terazi");
	   else if	((gun>=24 & ay.equalsIgnoreCase("ekim")==true)    | (gun<=22 & ay.equalsIgnoreCase("kasým")==true))
		   		System.out.println(" Burcunuz= Akrep");
	   else if	((gun>=23 & ay.equalsIgnoreCase("kasým")==true)   | (gun<=21 & ay.equalsIgnoreCase("aralýk")==true))
		   		System.out.println(" Burcunuz= Yay");
	   else if	((gun>=22 & ay.equalsIgnoreCase("aralýk")==true)  | (gun<=20 & ay.equalsIgnoreCase("ocak")==true))
		   		System.out.println(" Burcunuz= Oðlak");
	
	   else {System.out.println("Yanlýþ deðer girdiniz! Tekrar deneyiniz.");}  


 }
}