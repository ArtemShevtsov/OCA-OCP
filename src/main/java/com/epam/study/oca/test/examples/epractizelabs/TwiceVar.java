package com.epam.study.oca.test.examples.epractizelabs;

/**
 * Created by artem_shevtsov on 4/27/17.
 */
public class TwiceVar {
    static int y = 10;

    public static void main(String[] args) {
//        int y;
        int y = 7;
        System.out.println(y + TwiceVar.y);
    }
}
