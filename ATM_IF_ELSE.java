import java.util.Scanner;
public class ATM_IF_ELSE {
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
				
				while (bakiye>0) {	
						System.out.println(" (1)Para Yat�rma - (2)Para �ekme - (3)Bakiye G�r�nt�le  - (4)Sistemden ��k��");
						System.out.print("\n ��lem Se�iniz= "); islem = gir.nextInt();
				
					if(islem==1) 
					{
						System.out.print("\n Yat�r�lacak miktar= "); miktar=gir.nextInt();
							if (miktar<0) {System.out.println(" Ge�ersiz de�er! \n"); }
							else {bakiye+=miktar; System.out.println(" "+miktar+" tl hesab�n�za eklenmi�tir. Bakiyeniz: "+bakiye+" tl'dir. \n"); }
					}	
					else if(islem==2) 
					{
						System.out.print(" �ekilecek miktar= "); miktar=gir.nextInt(); 
							if (miktar>bakiye) {System.out.println(" Yetersiz Bakiye! \n"); }
							else {bakiye-=miktar; System.out.println(" "+miktar+" tl hesab�n�zdan �ekilmi�tir. Kalan bakiyeniz: "+bakiye+" tl'dir. \n"); }
					}	
					else if(islem==3) 
					{
						System.out.println(" Bakiyeniz: "+bakiye+" tl'dir. \n");
					}		
					
					else if(islem==4) 
					{
					System.out.println(" Sistemden ��k�ld�. �yi g�nler dileriz! \n"); break;	
					}
					else {System.out.println(" Ge�ersiz i�lem! \n"); }
								}
																}
			else if (kartno!=kayitlikartno | sifre!=kayitlisifre) {System.out.println(" Ge�ersiz Bilgi!");}
			
	}
}