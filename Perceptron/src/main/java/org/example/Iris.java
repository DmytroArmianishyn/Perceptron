package org.example;

import java.util.Arrays;

public class Iris {

    private double[] value;
    private String name;

    public Iris(double[] value, String name) {
        this.value = value;
        this.name = name;
    }

    public double[] getValue() {
        return value;
    }

    public void setValue(double[] value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Iris [" + Arrays.toString(value) + "]";
    }
}
