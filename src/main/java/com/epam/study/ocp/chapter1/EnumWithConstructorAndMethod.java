package com.epam.study.ocp.chapter1;

/**
 * Created by artem_shevtsov on 10/4/17.
 */

public enum EnumWithConstructorAndMethod {
    WINTER("W") {
        public void printHours() { System. out .println("9am-3pm"); }
    }, SPRING("sp") {
        public void printHours() { System. out .println("9am-5pm"); }
    }, SUMMER("su") {
        public void printHours() { System. out .println("9am-7pm"); }
    }, FALL("f") {
        public void printHours() { System. out .println("9am-5pm"); }
    };
    public abstract void printHours();

    private EnumWithConstructorAndMethod(String v) {
        System.out.println(v);
    }
}