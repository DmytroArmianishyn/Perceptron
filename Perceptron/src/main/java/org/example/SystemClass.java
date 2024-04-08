package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SystemClass {




    public void read(String file, List<Iris> irisList){
        try ( BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line=reader.readLine())!=null){
                String[] words = line.split(",");
                irisList.add(new Iris(new double[]{Double.parseDouble(words[0]),Double.parseDouble(words[1]),Double.parseDouble(words[2]),Double.parseDouble(words[3])},words[4]));


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public void start(Perceptron perceptron, List<Iris> irisList){
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice!=0) {
            System.out.println("1-traning on file");
            System.out.println("2-write your values");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    break;
                case 1 :
                traning(perceptron,irisList);
                start(perceptron,irisList);
                 break;
                case 2:
                   userValue(perceptron);

                    start(perceptron,irisList);
                    break;

            }
        }


    }


public void traning(Perceptron perceptron , List<Iris> irisList){
    for (int i = 0; i < irisList.size(); i++) {
        int predicted = perceptron.classify(irisList.get(i).getValue());

        int error = (int) (irisList.get(i).getLabel() - predicted);

        perceptron.learnWeights(irisList.get(i).getValue(), error, 0.1, (int) irisList.get(i).getLabel());


    }
    System.out.println((double) perceptron.count / irisList.size() * 100 + "%");
    System.out.println( "versicolor = " + perceptron.versicolorCount);
    System.out.println( "virginica = " + perceptron.virginicaCount);
    perceptron.virginicaCount=0;
    perceptron.versicolorCount=0;
    perceptron.count=0;

}


 public void userValue(Perceptron perceptron){
        Scanner scanner = new Scanner(System.in);

     double[] values = new double[4];
     double num;
     for (int i = 0; i <4 ; i++) {
         System.out.println("Write number");
         values[i]= scanner.nextDouble();
     }
     int predicted =  perceptron.classify(values);
     int error= ((int) 0-predicted);
     perceptron.learnWeights(values,error,0.1,0);
     String classy= (perceptron.lastChoice==1)?" versicolor":" virginica";
     System.out.println(perceptron.lastChoice + classy);
 }

}
