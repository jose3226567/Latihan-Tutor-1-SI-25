//12S25003- AFRIAN JOSSE SIADARI


import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int b1, b2, hpk, hp;

        b1 = input.nextInt();
        b2 = input.nextInt();
        if (b1 % 2 == 0) {
            System.out.println(Integer.toString(b1) + "=genap");
        } else {
            System.out.println(Integer.toString(b1) + "=ganjil");
        }
        if (b2 % 2 == 0) {
            System.out.println(Integer.toString(b2) + "=genap");
        } else {
            System.out.println(Integer.toString(b2) + "=ganjil");
        }
        if (b1 > b2) {
            System.out.println("paling besar=" + b1);
        } else {
            if (b1 < b2) {
                System.out.println(Integer.toString(b2) + "=paling besar");
            } else {
                System.out.println("b1 dan b2 sama besar");
            }
        }
        if (b1 % 2 == 0 && b2 % 2 == 0) {
            hp = b1 + b2;
            System.out.println("hasil penjumlahan:" + hp);
        } else {
            if (b1 % 2 != 0 && b2 % 2 != 0) {
                hpk = b1 * b2;
                System.out.println("hasil perkalian:" + hpk);
            }
        }
        if (b1 % 2 != 0 || b2 % 2 == 0) {
            System.out.println("berbeda jenis");
        } else {
            if (b2 % 2 != 0 || b1 % 2 == 0) {
                System.out.println("berbeda jenis");
            }
        }
    }
}
