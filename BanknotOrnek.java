import java.util.Scanner;
public class BanknotOrnek {
	public static void main(String[] args) {
		
		Scanner gir = new Scanner(System.in);
	    int x;
		System.out.print("\n Tutar giriniz= ");
	    int tutar = gir.nextInt();
	    x=tutar%10;	
	    
	    int bnot, bnot2, bnot3, bnot4, bnot5;
	    bnot=tutar/200;
	    bnot2=(tutar-(bnot*200))/100;
	    bnot3=((tutar-(bnot*200))%100)/50;
	    bnot4=(((tutar-(bnot*200))%100)-(bnot3*50))/20; 
	    bnot5=(((tutar-(bnot*200))%100)-((bnot3*50)+(bnot4*20)))/10;  

	    if(x==0 & bnot>0){System.out.println(" "+ bnot +" tane 200'lük banknot");}
	    if(x==0 & bnot2>0){System.out.println(" "+ bnot2 +" tane 100'lük banknot");}
	    if(x==0 & bnot3>0){System.out.println(" "+ bnot3 +" tane 50'lik banknot");}    
	    if(x==0 & bnot4>0){System.out.println(" "+ bnot4 +" tane 20'lik banknot");}
	    if(x==0 & bnot5>0){System.out.println(" "+ bnot5 +" tane 10'luk banknot");}
	    else if (x!=0 | tutar<0) {System.out.println(" Lütfen 0'dan büyük ve 10'un katý olan bir sayý giriniz.");}
	    
	}
}
