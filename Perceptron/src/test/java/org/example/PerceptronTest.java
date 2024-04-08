package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PerceptronTest {
    @Test
    void testClassify(){
        Perceptron perceptron = new Perceptron(4);

        int result = perceptron.classify(new double[]{5.1,2.5,3.0,1.1});
        Assertions.assertEquals(1,result);


    }
}
