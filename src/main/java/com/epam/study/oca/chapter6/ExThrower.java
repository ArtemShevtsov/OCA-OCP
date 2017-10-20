package com.epam.study.oca.chapter6;

/**
 * Created by artem_shevtsov on 4/3/17.
 */
public class ExThrower {
    public void doFall() throws FallDownException {
        throw new FallDownException();
    }
}
