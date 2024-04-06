package org.example;



import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Dmytro Armianishyn
 *
 */
public class App 
{
    public static void main( String[] args )
    {
JSONParser parser = new JSONParser();
        try(FileReader fileReader = new FileReader("D:\\Java\\TPO\\StatBasket\\Basket\\fil\\Players.json")) {

           Object obj = JSONValue.parse(fileReader);
           JSONArray array = (JSONArray) obj;
            System.out.println(array.get(0).g);

            for (:
                 ) {
                
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

