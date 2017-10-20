package com.epam.study.oca.chapter1;

/**
 * Created by artem_shevtsov on 4/5/17.
 */
public class ShiftOperators {
    public static void main(String[] args) {
        int x = -800;
        int y = 8;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println("Shifted right");
        System.out.println(Integer.toBinaryString(x>>1) + "\t\t" + (x>>1));
        System.out.println(Integer.toBinaryString(x>>>1) + "\t\t" + (x>>>1));
        System.out.println(Integer.toBinaryString(y>>1) + "\t\t" + (y>>1));
    }
}
