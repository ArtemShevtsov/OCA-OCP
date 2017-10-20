package com.epam.study.oca.chapter3;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by artem_shevtsov on 3/20/17.
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] qwer = {"hawk", "robin"};
        String[] qwer1 = {"hawk", "robin"};
        List<String> list = Arrays.asList(qwer);

        System.out.println(qwer.length);
        System.out.println(qwer[0] + " " + qwer[1]);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println();

        try{
            list.add("newone");
            System.out.println(list.size());

        }catch (Exception e){
            System.out.println("ADD TO LIST: " + e.getClass().getName());
            System.out.println(e.getMessage());
        }

        System.out.println();

        try{
            qwer[1] = "newone";
            System.out.println(qwer.length);
            System.out.println(qwer[0] + " " + qwer[1]);
            System.out.println(list.size());
            System.out.println(list);

        }catch (Exception e){
            System.out.println("CHANGE IN ARRAY: " + e.getClass().getName());
            System.out.println(e.getMessage());
        }

        System.out.println();

        try{
            list.set(1, "onemorenew");
            System.out.println(qwer.length);
            System.out.println(qwer[0] + " " + qwer[1]);
            System.out.println(list.size());
            System.out.println(list);

        }catch (Exception e){
            System.out.println("CHANGE IN LIST: " + e.getClass().getName());
            System.out.println(e.getMessage());
        }

        System.out.println();
        qwer1[0] = qwer[0];
        qwer1[1] = qwer[1];
        System.out.println(Arrays.asList(qwer).equals(Arrays.asList(qwer1)));
    }
}
