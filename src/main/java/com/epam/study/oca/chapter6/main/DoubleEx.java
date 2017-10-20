package com.epam.study.oca.chapter6.main;

import com.epam.study.oca.chapter6.ExThrower;
import com.epam.study.oca.chapter6.FallDownException;

/**
 * Created by artem_shevtsov on 4/3/17.
 */
public class DoubleEx {
    public static void main(String[] args) throws Exception {
        ExThrower exThrower = new ExThrower();
        System.out.println("Before Block");
        try{
            exThrower.doFall();
        } catch (FallDownException e) {

//            e.printStackTrace();
            System.out.println("Before New Exception");
            throw new Exception();
        } finally {
            System.out.println("Finnaly");
        }
        System.out.println("After Block");
    }
}
