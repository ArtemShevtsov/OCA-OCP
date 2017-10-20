package com.epam.study.oca.chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by artem_shevtsov on 3/20/17.
 */
public class DatesManipulations {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, Month.JANUARY, 31);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);

        String s = "one";
        boolean a = "one".equals(s);
        char b = 'c';
        b++;
        System.out.println(b);
    }
}
