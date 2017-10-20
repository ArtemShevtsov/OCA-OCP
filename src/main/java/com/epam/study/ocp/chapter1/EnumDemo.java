package com.epam.study.ocp.chapter1;

/**
 * Created by artem_shevtsov on 10/4/17.
 */
public class EnumDemo {
    public static void main(String[] args) {
        int a = 6;
        EnumWithConstructorAndMethod en = EnumWithConstructorAndMethod.SUMMER;
        EnumWithConstructorAndMethod enW = EnumWithConstructorAndMethod.WINTER;
        enW.printHours();

        Integer integer = 123;
        int iii = 123;
        System.out.println(integer.equals(iii));
    }
}
