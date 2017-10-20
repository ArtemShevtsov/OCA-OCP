package com.epam.study.ocp.chapter3.comparators;

/**
 * Created by artem_shevtsov on 7/10/17.
 */
public class Duck {
    private int weight;
    private int age;

    public Duck(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "weight=" + weight +
                ", age=" + age +
                '}';
    }
}
