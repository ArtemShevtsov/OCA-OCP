package com.epam.study.ocp.chapter3.comparators;

/**
 * Created by artem_shevtsov on 7/10/17.
 */
public class DuckHelper {
    public int compareByWeight(Duck d1, Duck d2){
        return d1.getWeight() - d2.getWeight();
    }

    public int compareByAge(Duck d1, Duck d2){
        return d1.getAge() - d2.getAge();
    }
}
