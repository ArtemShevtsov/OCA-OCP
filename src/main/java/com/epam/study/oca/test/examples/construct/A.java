package com.epam.study.oca.test.examples.construct;

/**
 * Created by artem_shevtsov on 4/27/17.
 */
public class A {
    int y;
    public A(int x){
        y = x;
    }

    public void print(){
        System.out.println(y);
    }
}

class B extends A{
    public B( int x){
        super(x);
    }
}
