package com.epam.study.yura.excercise;

import com.epam.study.yura.excercise.interfaces.FirstFunction;

/**
 * Created by artem_shevtsov on 5/4/17.
 */
public class Client {
    public static void main(String[] args) {
        FirstFunction f1 = (a,b) -> {
            int q = 5*a;
            int w = 3*b;
            return (q+w)/2;
        };

        FirstFunction f2 = (a,b) -> 7*a - 3*b;

        System.out.println("f1:\t(5a + 3b)/2\nf2:\t(7a-3b)");
        System.out.println("Result = f1(3,4) - f2(7,8)");
        System.out.println("Result: " + calculateResult(f1,f2));
    }

    public static int calculateResult(FirstFunction f1, FirstFunction f2){
        return f1.doCalculation(3,4) - f2.doCalculation(7,8);
    }

    private void method(){}
}
