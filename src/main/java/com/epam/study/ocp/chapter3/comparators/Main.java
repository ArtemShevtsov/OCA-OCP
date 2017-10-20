package com.epam.study.ocp.chapter3.comparators;

import java.util.*;

/**
 * Created by artem_shevtsov on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        DuckHelper duckHelper = new DuckHelper();
        Duck yangDuck = new Duck(10, 20);
        Duck oldDuck = new Duck(30, 11);

        Comparator<Duck> byAgeComparator = duckHelper::compareByAge;
        Comparator<Duck> byWeightComparator = duckHelper::compareByWeight;

        List<Duck> ducks = new ArrayList<>();
        ducks.add(yangDuck);
        ducks.add(oldDuck);

        Collections.sort(ducks, byAgeComparator);
        System.out.println(ducks);

        Collections.sort(ducks, byWeightComparator);
        System.out.println(ducks);
    }
}
