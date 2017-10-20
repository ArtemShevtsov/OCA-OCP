package com.epam.study.ocp.chapter7;

/**
 * Created by artem_shevtsov on 8/4/17.
 */
public class CountManager {
    private int sheepCount = 0;

    public void doIncrementAndPring(){
        System.out.print((++sheepCount) + " ");
    }
}
