package com.epam.study.oca.chapter2;

public class Main {
    public static void main(String args[]) { 
        StringBuilder s = new StringBuilder(10 + 2 + "ABC" + 4 + 5);
        System.out.println(s);
        String sss = s.delete(3, 6).toString();
        System.out.println(sss);
        System.out.println(s);
        s.append(sss);
        System.out.println(s);
    } 
}