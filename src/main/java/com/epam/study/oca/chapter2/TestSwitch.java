package com.epam.study.oca.chapter2;

/**
 * Created by artem_shevtsov on 4/26/17.
 */
public class TestSwitch {
    public static void main(String[] args) {
        String q = "aaa";
        switch (q){
            case "aaa":
                System.out.println("Str works");
                break;
            default:
                System.out.println("SSS");
        }

        int x = 3;
        int y = ++x * 4/x-- + --x;
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
    }
}
