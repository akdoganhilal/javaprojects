package com.mycompany.gno_hesaplama;
import java.util.Scanner;

public class GNO_Hesaplama {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        int kredi;
        double aa = 4, ba = 3.5, bb = 3, cb = 2.5, cc = 2, dc = 1.5, dd = 1, ff = 0, knottop = 0, kredinot = 0, gno, topla = 0;
        String a = "AA", b = "BA", c = "BB", d = "CB", e = "CC", f = "DC", g = "DD", h = "FF", hnot;
        System.out.print("\n Aldığınız Ders Sayısı= ");
        int derssayi;
        try {
            derssayi = gir.nextInt();
        } catch (Exception hata) {
            System.out.println("Hatalı giriş! Ders sayısı bir tam sayı olmalı.");
            return;
        }
        for (int i = 1; i <= derssayi; i++) {
            System.out.print("\n " + i + ". Dersin Harf Notu = ");
            hnot = gir.next().toUpperCase();

            System.out.print(" " + i + ". Dersin Kredisi= ");
            try {
                kredi = gir.nextInt();
            } catch (Exception ex) {
                System.out.println("Hatalı giriş! Ders kredisi bir tam sayı olmalı.");
                return;
            }

            topla += kredi;
            switch (hnot) {
                case "AA":
                    kredinot = kredi * aa;
                    break;
                case "BA":
                    kredinot = kredi * ba;
                    break;
                case "BB":
                    kredinot = kredi * bb;
                    break;
                case "CB":
                    kredinot = kredi * cb;
                    break;
                case "CC":
                    kredinot = kredi * cc;
                    break;
                case "DC":
                    kredinot = kredi * dc;
                    break;
                case "DD":
                    kredinot = kredi * dd;
                    break;
                case "FF":
                    kredinot = kredi * ff;
                    break;
                default:
                    System.out.println("Hatalı giriş! Geçerli bir harf notu giriniz (AA, BA, BB, CB, CC, DC, DD, FF).");
                    return;
            }
            knottop += kredinot;
        }
        if (topla == 0) {
            System.out.println("Hatalı giriş! Toplam kredi 0 olamaz.");
            return;
        }
        gno = knottop / topla;
        System.out.println("\n Genel Not Ortalamanız= " + gno);
    }
}
