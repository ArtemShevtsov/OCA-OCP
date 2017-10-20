package com.epam.study.oca.test.examples;

import com.epam.study.oca.test.examples.elab.CorrectOverload;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by artem_shevtsov on 4/26/17.
 */
public class QuestionsFromTest {
    public static void main(String[] args) {
        int $ocajp = 3;
        String str = "1.2";
        /**
         * incarrect identifiers:
         * 2DPoint
         * new
         * java@elabs
         * $*cofee
         * ...
         */

        System.out.println(Instant.now());
        Runnable run = () -> System.out.println("text");

        one();
    }

    public static void one() {
        try {
            Object numObj = new Integer(2);
            String str = (String) numObj;
            System.out.println(str);
        } catch (ClassCastException e ){
            System.out.println("ClassCastException");
        }
    }
    public static void two(){
        String str = "1.2";
        float v = Float.parseFloat(str);
        System.out.println(v);
    }

    public static void three(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1); list.add(2); list.add(3);
        for(int x : list){
            System.out.println(x + " ");
            break;
        }
    }

    public static void four(){
        try{
            Integer arr[] = new Integer[0];
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NegativeArraySizeException e){
            System.out.println("NegativeArraySizeException");
        }
    }

    public static void five(){
        String str = "1Z0";
        StringBuilder sb = new StringBuilder("-");
        sb.append("808");
        str.concat(sb.toString());
        System.out.println(str);

    }

    public static void six(){
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(11); list.add(30); list.add(9);
        list.removeIf(e -> e%2 != 0);
        System.out.println(list);
    }

    public static void seven(){
        CorrectOverload correctOverload = new CorrectOverload();
        correctOverload.print();
        correctOverload.doprint();
    }

    public static void eight(){
        LocalDate date = LocalDate.of(2015, 3, 24);
        Period p = Period.ofDays(2);
        System.out.println(date.plus(p));
    }

    public static void nine(){
        Integer arr[] = {1,2,3,4};
        arr[1] = null;
        for(Integer a: arr){
            System.out.print(a);
        }
    }

    public static void ten(){
        int x = 3;
        int y = ++x * 4 / x-- + --x;
        System.out.println("y + x is " + (y + x));
    }

    public static void eleven(){
        String y = "Y";
        final String n = "N";
        String in = "y";

        switch (in.toUpperCase()){
//            case y:
//                System.out.println("Yes");
            case n:
                System.out.println("No");
                break;
            default:
                System.out.println("Y/N");
        }
    }
}
