package com.epam.study.oca.test.examples;

/**
 * Created by artem_shevtsov on 5/30/17.
 */
public interface AbstractImplementation {
    public void print();
    public void write();
}

abstract class A implements AbstractImplementation { //line 1
    public void print(){}
    //line 2
    public void write(){}
}

class B extends A{ //line 3
    public void print(){}
    //line 4
//    public void write(){}
}
