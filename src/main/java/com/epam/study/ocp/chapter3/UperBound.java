package com.epam.study.ocp.chapter3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by artem_shevtsov on 7/3/17.
 */
public class UperBound {
    public static void main(String[] args) {
        List<? super IOException> exs = new ArrayList<Exception>();
        exs.add(new IOException());
    }
}
