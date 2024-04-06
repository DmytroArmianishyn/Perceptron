package org.example;


import java.util.ArrayList;
import java.util.List;

public class Perceptron {

    List<List<Double>> weights= new ArrayList<>();

    double bias;




    public double activate(double a){


        return a<0?0:1;
    }





}
