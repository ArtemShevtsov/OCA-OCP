package com.epam.study.oca.chapter1;

/**
 * Created by artem_shevtsov on 2/22/17.
 */
public class ModifyParamsInsideVoidMethod {
    public static class IntBox{
        private int val;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int primitiveInt = 2;
        Integer objectInt = 6;
        IntBox intBox = new IntBox();
        intBox.setVal(10);

        modifyPrimitive(primitiveInt);
        modifyObject(objectInt);
        modifyvalInBox(intBox);

        System.out.println(primitiveInt);
        System.out.println(objectInt);
        System.out.println(intBox.getVal());
    }
    private static void modifyPrimitive(int a){
        a = a + 2;
    }

    private static void modifyObject(Integer a){
        a = a + 2;
    }

    private static void modifyvalInBox(IntBox box){
        int val = box.getVal();
        box.setVal(val + 2);
    }
}
