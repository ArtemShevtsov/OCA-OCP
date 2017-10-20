package com.epam.study.oca.test.examples.mport;

import com.epam.study.oca.test.examples.mport.a.*;
import com.epam.study.oca.test.examples.mport.b.MyPrinter;

/**
 * Created by artem_shevtsov on 5/3/17.
 */
public class Demonstration {
    public static void main(String[] args) {
        MyPrinter myPrinter = new MyPrinter();
        myPrinter.print();

        com.epam.study.oca.test.examples.mport.a.MyPrinter myPrinter1 = new com.epam.study.oca.test.examples.mport.a.MyPrinter();
        myPrinter1.print();
    }
}
