import java.util.Random;
public class OrtadakiSayiyiBulma {
	public static void main(String[] args) 
	{
		Random random = new Random();
        int x = 1000000 + random.nextInt(9999999);
        String a = String.valueOf(x);
        int k = a.length();
        int o = k / 2;
        char s;
        if (k % 2 == 0) { s = a.charAt(o-1); } 
        else { s = a.charAt(o); }
        System.out.println("\n Sayý= " + x + ",  Basamak sayýsý= " + k + ",  Ortadaki sayý= " + s);	
	}
}