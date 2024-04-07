package org.example;

import java.util.Arrays;

public class Iris {

    private double[] value;
    private String name;

    private double label;

    public Iris(double[] value, String name) {
        this.value = value;
        this.name = name;
        if (name.equals("Iris-versicolor"))
            this.label=1.0;
        else
            this.label=0.0;
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


    public double getLabel() {
        return label;
    }

    public void setLabel(double label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Iris " + name + " [" + Arrays.toString(value) + " " + label +  "]";
    }
}
