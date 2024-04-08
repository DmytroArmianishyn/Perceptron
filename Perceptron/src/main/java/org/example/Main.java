package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> iris = new HashMap<>();
        iris.put("Iris-versicolor",1.0);
        iris.put("Iris-virginica",0.0);

        SystemClass system = new SystemClass();
        List<Iris> irisList = new ArrayList<>();
        system.read("D:\\Java\\TPO\\StatBasket\\Perceptron\\src\\files\\traning",irisList);

        Perceptron perceptron = new Perceptron(4);



            system.start(perceptron,irisList);






        double[] dany = new double[]{6.3,2.7,4.9,1.8};

        int predicted =  perceptron.classify(dany);
        int error= ((int) 0-predicted);
        perceptron.learnWeights(dany,error,0.1,0);



    }
}