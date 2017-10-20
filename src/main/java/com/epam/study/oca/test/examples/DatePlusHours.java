package com.epam.study.oca.test.examples;

import java.time.LocalDate;

/**
 * Created by artem_shevtsov on 4/26/17.
 */
public class DatePlusHours {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2014-12-30");
        date = date.plusDays(2);
//        date.plusHours(12);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
