package com.epam.study.oca.test.examples.interf;

/**
 * Created by artem_shevtsov on 4/27/17.
 */
public interface A {
    int groupId = 10;
    /*equals is invalid name*/
    default boolean equalss(Object obj){
        return this.groupId == ((A)obj).groupId;
    }
    static void print(){
        System.out.println("A");
    }

    /*toString is invalid name*/
    default String toStringg(){
        return "a";
    }
}
