package com.epam.study.oca.test.examples.elab;

/**
 * Created by artem_shevtsov on 4/27/17.
 */
public class CorrectOverload {
    public void print(){
        System.out.println("print without params");
    }

    private int print(int x){
        System.out.println("overloaded print with int param");
        return x;
    }

    public void doprint(){
        System.out.println(print(8));
    }

}
