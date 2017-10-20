package com.epam.study.ocp.chapter3.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by artem_shevtsov on 10/20/17.
 */
public class GenerilizedInMethods {
    public GenerilizedInMethods() {
    }

    public <T> T nonStaticMethod(T arg){
        return arg;
    }

    public static <T> T staticMethod(T arg) {
        return arg;
    }

    public static void main(String[] args) {
        HashMap<Object, Object> aMap = new HashMap<>();
        ArrayList<Object> aList = new ArrayList<>();
        System.out.println(staticMethod(aList).getClass());
        System.out.println(GenerilizedInMethods.<Map>staticMethod(aMap).getClass());

        GenerilizedInMethods generilizedInMethods = new GenerilizedInMethods();
        System.out.println(generilizedInMethods.nonStaticMethod(aList).getClass());
        System.out.println(generilizedInMethods.nonStaticMethod(aMap).getClass());
    }
}
