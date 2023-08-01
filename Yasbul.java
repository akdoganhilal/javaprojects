package com.mycompany.yasbul;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Yasbul {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        LocalDate tarih = LocalDate.now();
        int Gun = tarih.getDayOfMonth();
        int Ay = tarih.getMonthValue();
        int Yil = tarih.getYear();

        System.out.println("\n Bugünün tarihi: " + Gun + "/" + Ay + "/" + Yil);
        System.out.print(" Kaçıncı günde doğdunuz? ");
        int gun = giris.nextInt();
        System.out.print(" Kaçıncı ayda doğdunuz? ");
        int ay = giris.nextInt();
        System.out.print(" Hangi yılda doğdunuz? ");
        int yil = giris.nextInt();
        System.out.println(" Doğum tarihiniz= " + gun + "/" + ay + "/" + yil);

        LocalDate dgmtarih = LocalDate.of(yil, ay, gun);
        Period period = Period.between(dgmtarih, tarih);
        int yasYil = period.getYears();
        int yasAy = period.getMonths();
        int yasGun = period.getDays();
        System.out.println("\n " + yasYil + " yıl, " + yasAy + " ay, " + yasGun + " gündür hayattasınız.");
    }
}



