package com.epam.study.ocp.chapter3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

/**
 * Created by artem_shevtsov on 10/20/17.
 */
public class Generilized<T> {
    //Will not compile if delete this row
    private T valieable;

    public Generilized() {
    }

    public Generilized(T valieable) {
        this.valieable = valieable;
    }

    public T getValieable() {
        return valieable;
    }

    public void setValieable(T valieable) {
        this.valieable = valieable;
    }

    public static void main(String[] args) {
        Generilized<List> arrayListGenerilized = new Generilized<>();
        arrayListGenerilized.setValieable(asList("VVV"));
        System.out.println(arrayListGenerilized.getValieable());
    }
}
