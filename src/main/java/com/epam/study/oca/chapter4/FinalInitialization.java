package com.epam.study.oca.chapter4;

/**
 * Created by artem_shevtsov on 3/28/17.
 */
public class FinalInitialization {
    private final int declaration = 1;
    private final int instanceInitialization;
    private final int constructorInitialization;
    private final int blockInitialization;
    private final static int staticBlockInitialization;

    {
        blockInitialization = 4;
    }

    static {
        staticBlockInitialization = 5;
    }

    FinalInitialization(){
        this.constructorInitialization = 3;
//        YOU CAN NOT INITIALIZE FINAL IN CLIENT CODE
//        ONLY IN BLOCK OR CONSTRUCTOR
        this.instanceInitialization = 2;
    }

    public static void main(String[] args) {
        FinalInitialization instance = new FinalInitialization();
//        YOU CAN NOT DO THIS, INITIALIZE IN CONSTRUCTOR!!!
//        instance.instanceInitialization = 2;
        System.out.println(instance);
        System.out.println(staticBlockInitialization);
    }

    @Override
    public String toString() {
        return "FinalInitialization{" +
                "declaration=" + declaration +
                ", instanceInitialization=" + instanceInitialization +
                ", constructorInitialization=" + constructorInitialization +
                ", blockInitialization=" + blockInitialization +
                '}';
    }
}
