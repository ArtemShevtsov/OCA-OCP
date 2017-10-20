package com.epam.study.oca.chapter5;

/**
 * Created by artem_shevtsov on 3/30/17.
 */
public class Overriding extends FirstClassO {
    static{
        System.out.println("Static Block Overriding");
    }

    public static void staticMethod(){
        System.out.println("Static from Overriding");
    }

    @Override //Cant do this as it private in parent so you dont have ability to override
    public void text(){
//        super.text(); Cant do this as it private access in parent
        System.out.println("text from Overriding");
    }

    public static void main(String[] args) {
        FirstClassO firstClassO = new Overriding();
        Overriding overriding = new Overriding();
        firstClassO.staticMethod();
        overriding.staticMethod();

        new FirstClassO().text();
        overriding.text();
    }
}

class FirstClassO {
    private void method(int a){
        System.out.println("From FirstClassO, a = " + a);
    }

    static {
        System.out.println("Static Block FirstClassO");
    }

    public static void staticMethod(){
        System.out.println("Static from FirstClassO");
    }

    protected void text(){
        System.out.println("text from First");
    }

    public void diffTypes(int a){
        System.out.println(a);
    }
}
