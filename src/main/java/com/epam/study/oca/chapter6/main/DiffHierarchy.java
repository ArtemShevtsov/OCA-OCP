package com.epam.study.oca.chapter6.main;

import com.epam.study.oca.chapter6.ExThrower;
import com.epam.study.oca.chapter6.FallDownException;

/**
 * Created by artem_shevtsov on 4/3/17.
 */
public class DiffHierarchy {
    public static void main(String[] args) {
        ExThrower exThrower = new ExThrower();
        try{
            exThrower.doFall();
        }
        /*Do not Compile
        catch (RuntimeException e) {
            e.printStackTrace();
        }
        */
        catch(FallDownException e){
            e.printStackTrace();
        }
    }
}
