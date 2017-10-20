package com.epam.study.ocp.chapter5;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by artem_shevtsov on 7/26/17.
 */
public class DatesExample {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2018, Month.FEBRUARY, 30);
        System.out.println(d.getMonth() + "  " + d.getDayOfMonth());
    }
}
