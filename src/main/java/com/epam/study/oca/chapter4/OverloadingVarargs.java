package com.epam.study.oca.chapter4;

/**
 * Created by artem_shevtsov on 3/27/17.
 */
public class OverloadingVarargs {
    public static void main(String[] args) {
        OverloadingVarargs instance = new OverloadingVarargs();
        instance.printVal(3);
        instance.printVal(new Integer(4));
        instance.printVal((double)5);
        instance.printVal(new Double(6));
        instance.printVal(new Double(7.));
        instance.printVal(new Double("8."));
        instance.printVal(9.0);
        instance.printVal(10L);
        instance.printVal(new Long(11));
    }

    public void printVal(int intVal){
        System.out.println("int:\t\t" + intVal);
    }

    public void printVal(Integer intVal){
        System.out.println("Integer:\t\t" + intVal);
    }

    public void printVal(double dVal){
        System.out.println("double:\t\t" + dVal);
    }

    public void printVal(Double dVal){
        System.out.println("Double:\t\t" + dVal);
    }

    public void printVal(Long lVal){
        System.out.println("Long:\t\t" + lVal);
    }

    public void printVal(long lVal){
        System.out.println("long:\t\t" + lVal);
    }

    /*

    * YOU CAN NOT DO THIS!!!
    *
    private void printArr(int[] arr){
        System.out.println(arr);
    }

    private void printArr(int... arr){
        System.out.println(arr);
    }
    */
}
