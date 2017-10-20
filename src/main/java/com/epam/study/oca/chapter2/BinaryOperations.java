package com.epam.study.oca.chapter2;

/**
 * Created by artem_shevtsov on 2/28/17.
 */
public class BinaryOperations {
    public static void main(String[] args) {
        short c = 3;
        double a = 1.2;
        float _b = 2;


        System.out.println("short c * float _b = " + c*_b);
        System.out.println(((Object)(c*_b)).getClass().getName());

        System.out.println("short c * float _b / double a = " + c*_b/a);
        System.out.println(((Object)(c*_b/a)).getClass().getName());

        System.out.println("float _b + double a = " + _b + a);
        System.out.println(((Object)(_b+a)).getClass().getName());
    }
}
