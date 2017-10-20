package com.epam.study.oca.chapter5;

/**
 * Created by artem_shevtsov on 3/29/17.
 */
public class ThisAndSuper extends FirstClass implements Inn{
    ThisAndSuper(int a){
        super(a);
        System.out.println("ThisAndSuper, a = " + a);
    }

    ThisAndSuper(){
        this(7);
        System.out.println("ThisAndSuper");
    }

    public static void main(String[] args) {
        Inn thisAndSuper = new ThisAndSuper();
//        System.out.println(thisAndSuper.mmm());
        System.out.println(Inn.mmm());
    }
}

class FirstClass {
    FirstClass(){
        System.out.println("FirstClass");
    }

    FirstClass(int a){
        System.out.println("FirstClass, a = " + a);
    }
}
interface Inn{
    public static String mmm(){
        return "qwe";
    }
}
