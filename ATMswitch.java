import java.util.Scanner;
public class ATMswitch {
	public static void main(String[] args) {

		Scanner gir = new Scanner(System.in);
		int kayitlikartno=1, kayitlisifre=2;
		System.out.print("\n Hilal Bankas�na Ho�geldiniz. \n Kart Numaran�z= ");
		int kartno = gir.nextInt();
		System.out.print(" �ifreniz= ");
		int sifre = gir.nextInt();
		
			if (kartno==kayitlikartno & sifre==kayitlisifre){System.out.println(" Giri� Ba�ar�l�! \n");	
				int bakiye = 3500;
				int islem=0, miktar=0;	
				
				while (islem!=4) {	
						System.out.println(" (1) Bakiye G�r�nt�le");
						System.out.println(" (2) Para Yat�rma");
						System.out.println(" (3) Para �ekme");
						System.out.println(" (4) Sistemden ��k��");
						System.out.print("\n ��lem Se�iniz= ");
						islem = gir.nextInt();
				
					switch(islem){	
						case 1: System.out.println(" Bakiyeniz: "+bakiye+" tl'dir. \n"); break;
						case 2: System.out.print("\n Yat�r�lacak miktar= "); miktar=gir.nextInt(); 
							if (miktar<0) {System.out.println(" Ge�ersiz de�er! \n"); break;}
							else {bakiye+=miktar; System.out.println(" "+miktar+" tl hesab�n�za eklenmi�tir. Bakiyeniz: "+bakiye+" tl'dir. \n"); break;}
						case 3: System.out.print(" �ekilecek miktar= "); miktar=gir.nextInt(); 
							if (miktar>bakiye) {System.out.println(" Yetersiz Bakiye! \n"); break;}
							else {bakiye-=miktar; System.out.println(" "+miktar+" tl hesab�n�zdan �ekilmi�tir. Kalan bakiyeniz: "+bakiye+" tl'dir. \n"); break;}			
						case 4: System.out.println(" Sistemden ��k�ld�. �yi g�nler dileriz! \n"); break;
						default: System.out.println(" Ge�ersiz i�lem! \n"); break;} 
							   }	
															}	
			else if (kartno!=kayitlikartno | sifre!=kayitlisifre) {System.out.println(" Ge�ersiz Bilgi!");}
			System.out.println(" -Hilal Akdo�an");
	}
}