package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        Map<String,Double> iris = new HashMap<>();
        iris.put("Iris-versicolor",1.0);
        iris.put("Iris-virginica",0.0);

        SystemClass system = new SystemClass();
        List<Iris> irisList = new ArrayList<>();
        system.read("D:\\Java\\TPO\\StatBasket\\Perceptron\\src\\files\\traning",irisList);

        Perceptron perceptron = new Perceptron(4);



            //system.start(perceptron,irisList);


            int tmp=0;
        for (int i = 0; i <150000 ; i++) {
            System.out.println(i);
            System.out.println(i-tmp);
            tmp=i;

        }





        double[] dany = new double[]{6.3,2.7,4.9,1.8};

        int predicted =  perceptron.classify(dany);
        int error= ((int) 0-predicted);
        //perceptron.learnWeights(dany,error,0.1,0);
        Long end = System.currentTimeMillis();


        System.out.println(end-start);
    }
}