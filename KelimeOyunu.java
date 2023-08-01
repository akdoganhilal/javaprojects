import java.io.*;
public class KelimeOyunu
{
        public static void main(String args[])throws IOException
        {
                String kelime = ""
                		+ "hilal";int i,tahmin=0,anahtar=0,dogru=0;
                String eldevar[] = new String[kelime.length()];
                System.out.println("Kelimeyi bulmak için 5 yanlýþ hakkýnýz var.");
                BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));
                for (i = 0; i < kelime.length(); i++) {eldevar[i] = "_ ";}
                finish:
                while(tahmin<5)
                {
                   System.out.println("Bir harf giriniz. Kalan hak= " + (5 - tahmin) );
                   String harf = klavye.readLine();
                   tahmin++;
                        for (i = 0; i < kelime.length(); i++)
                        {
                                if (kelime.charAt(i) == harf.charAt(0))
                                {
                                   eldevar[i] = harf+" ";
                                   anahtar = 1;
                                   dogru++;
                                   if (dogru == kelime.length()) { System.out.println("Doðru cevap, tebrikler!"); break finish; }
                                }
                        }
                        if (anahtar == 1) { anahtar = 0; tahmin--; }
                        for (i = 0; i < kelime.length(); i++) {System.out.print(eldevar[i]);}
                        System.out.println();
                }
                if (dogru != kelime.length()) { System.out.println("Bilemediniz... Doðru cevap " + kelime + " olacaktý."); }
        }
}

