//12S25003-AFRIAN JOSSE SIADARI


import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int b1, b2, hpk, hp;

        b1 = input.nextInt();
        b2 = input.nextInt();
        if (b1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan Pertama : Ganjil");
        }
        if (b2 % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (b1 > b2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (b1 < b2) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (b1 % 2 == 0 && b2 % 2 == 0) {
            hp = b1 + b2;
            System.out.println("Hasil penjumlahan:" + hp);
        } else {
            if (b1 % 2 != 0 && b2 % 2 != 0) {
                hpk = b1 * b2;
                System.out.println("Hasil perkalian:" + hpk);
            }
        }
        if (b1 % 2 != 0 && b2 % 2 == 0) {
            System.out.println("Berbeda jenis");
        } else {
            if (b2 % 2 != 0 && b1 % 2 == 0) {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
