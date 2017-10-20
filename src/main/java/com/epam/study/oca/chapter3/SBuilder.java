package com.epam.study.oca.chapter3;

/**
 * Created by artem_shevtsov on 3/24/17.
 */
public class SBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(20);
        sb1.append("abcd");
        System.out.println("Length: " + sb1.length());
        System.out.println("capacity: " + sb1.capacity());
        System.out.println(sb1.toString());
        System.out.println();

        for(int i = 0; i < 20; i++){
            sb1.append('F');
        }

        System.out.println("Length: " + sb1.length());
        System.out.println("capacity: " + sb1.capacity());
        System.out.println(sb1.toString());
    }
}
