package com.epam.study.oca.chapter1;

/**
 * Created by artem_shevtsov on 2/22/17.
 */
public class InstanceInitializerBlock {
    private String stringVar;
    private String stringVar1 = "bla";
    {
        System.out.println("first instance initializer block");
        System.out.println(stringVar + "--" + stringVar1);
        stringVar = "changed";
        stringVar1 = "blaChanged";
        System.out.println(stringVar + "--" + stringVar1);
    }
    public InstanceInitializerBlock(){
        System.out.println("constructor");
    }
    public InstanceInitializerBlock(String p){
        stringVar = p;
        System.out.println("constructor with param");
        System.out.println(stringVar);
    }

    public static void main(String[] args) {
        InstanceInitializerBlock instance1 = new InstanceInitializerBlock();
        InstanceInitializerBlock instance2 = new InstanceInitializerBlock("realValue");
        System.out.println("PSVM instance1");
        System.out.println(instance1.stringVar + "--" + instance1.stringVar1);

        System.out.println("PSVM instance2");
        System.out.println(instance2.stringVar + "--" + instance2.stringVar1);
    }
}
