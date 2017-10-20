package com.epam.study.ocp.chapter3.generics;

import java.util.*;

/**
 * Created by artem_shevtsov on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);

        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(m.containsKey("123"));
    }
}
