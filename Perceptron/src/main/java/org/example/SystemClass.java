package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

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







}
