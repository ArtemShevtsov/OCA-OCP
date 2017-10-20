package com.epam.study.oca.chapter2;

/**
 * Created by artem_shevtsov on 3/24/17.
 */
public class WhichWillCall {
    public static void main(String[] args) {
        int a = 1, b=2;
        new WhichWillCall().doAction(a, b);
    }

    public void doAction(char c, long l){
        System.out.println("char and long");
    }

    public void doAction(String s1, String s2){
        System.out.println("two strings");
    }

    public void doAction(Integer i1, Integer i2){
        System.out.println("two integer objects");
    }

    public void doAction(int i1, int i2){
        System.out.println("two int primitives");
    }

    public void doAction(Integer... ints){
        System.out.println("integer object varargs");
    }

    public void doAction(int... ints){
        System.out.println(ints.getClass());
        System.out.println(new int[3]);
        System.out.println("int primitives varargs");
    }

}
