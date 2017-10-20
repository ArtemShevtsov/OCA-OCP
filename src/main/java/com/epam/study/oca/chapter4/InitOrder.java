package com.epam.study.oca.chapter4;

/**
 * Created by artem_shevtsov on 3/28/17.
 */
public class InitOrder extends SecondSuper {

    static{
        System.out.println("Static Block in InitOrder");
    }

    {
        System.out.println("RegularBlock in InitOrder");
    }

    InitOrder(){
        this(33);
        System.out.println("InitOrder Constructor");
    }

    InitOrder(int a){
        System.out.println("InitOrder Constructor | a = " + a);
    }

    public static void main(String[] args) {
        System.out.println("PSVM");
        System.out.println();
        InitOrder instance = new InitOrder();
        System.out.println();
        InitOrder instance2 = new InitOrder(5);
        System.out.println();
        SecondSuper secondSuperInstance = new SecondSuper(10);
    }
}

class FirstSuper{
    static int staticVar = 15;
    static{
        System.out.println("Static Block in FirstSuper");
        System.out.println("StaticVar = " + staticVar);
        staticVar = 20;
        System.out.println("StaticVarChanged = " + staticVar);
    }

    {
        System.out.println("RegularBlock in FirstSuper");
    }

    FirstSuper(){
        System.out.println("FirstSuper Constructor");
    }
}

class SecondSuper extends FirstSuper{

    static{
        System.out.println("Static Block in SecondSuper");
    }

    {
        System.out.println("RegularBlock in SecondSuper");
    }

    SecondSuper(){
        System.out.println("SecondSuper Constructor");
    }

    SecondSuper(int a){
        System.out.println("SecondSuper Constructor | a = " + a);
    }
}