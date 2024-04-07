package org.example;


import java.util.ArrayList;
import java.util.List;

public class Perceptron {

    private double[] weights;

   private double bias;
   int count=0;




    public Perceptron(int size) {
        weights = new double[size];

        for (int i = 0; i <size ; i++) {
            weights[i]=(Math.random()*2)+-1;
            System.out.println(weights[i]);
        }
        bias=3;

    }

    public int classify(double[] input){
        double sum=0;

        for (int i = 0; i <input.length ; i++) {

            sum+=input[i]*weights[i];
            
        }

        return sum>0?1:0;
    }


    public void learnWeights(double[] input, int target, double learningRate,int right){
        int output = classify(input);
        int choice = target-output;

        for (int i = 0; i <weights.length ; i++) {
            weights[i]+=learningRate*choice*input[i];
        }
        bias += learningRate*choice;

        System.out.println(choice);


if (choice==right){
    count++;
}




    }





}
