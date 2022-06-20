package com.rplbo.mathexpression;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("=====Operator Tripel Pythagoras=====");
        System.out.print("\n");
        System.out.print("Nilai X : ");
        int a = scn.nextInt();
        System.out.print("Nilai Y : ");
        int b = scn.nextInt();
        System.out.print("Nilai Z : ");
        int c = scn.nextInt();

        int max = a;
        if (b >= max)
            max = b;

        if (c >= max)
            max = c;

        if (max == a) {
            System.out.println((b * b + c * c) == (a * a));
        } else if (max == b) {
            System.out.println((a * a + c * c) == (b * b));
        } else {
            System.out.println((a * a + b * b) == (c * c));
        }

        System.out.print("=====Operator Pangkat======");
        System.out.print("\n");
        System.out.print("Masukkan angka A : ");
        int d = scn.nextInt();
        System.out.print("Masukkan angka B : ");
        int e = scn.nextInt();
        int f = (int)Math.pow(d, e);
        System.out.println("Hasil Pangkatnya = "  + f);
    }
}