package com.epam.study.oca.chapter5;

/**
 * Created by artem_shevtsov on 3/31/17.
 */
public class Convariant extends DoubleVal {
    @Override
    public Integer getVal(){
        Integer integer = new Integer(20);
        System.out.println("Convariant, getVal = " + integer);
        return integer;
    }

    @Override
    public void throwsEx() throws NullPointerException{
        System.out.println("Convariant, NullPointerException");
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        try {
            Convariant convariant = new Convariant();
            convariant.getVal();
            convariant.throwsEx();
        }catch (Exception e){

        }

        try{
            DoubleVal doubleVal = new DoubleVal();
            doubleVal.getVal();
            doubleVal.throwsEx();
        }catch(Exception e){

        }
    }
}

class DoubleVal{
    public Number getVal(){
        Double aDouble = new Double(10.0);
        System.out.println("DoubleVal, getVal = " + aDouble);
        return aDouble;
    }

    public void throwsEx() throws RuntimeException{
        System.out.println("DoubleVal, RunTimeEx");
        throw new RuntimeException();
    }
}
