package com.company;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
public class Main {

    public static void main(String[] args) {
        Map<String, String> states = new HashMap<>();
        populateMap(states);

        Set<String> skey = states.keySet();
        System.out.println("States:");
        System.out.println("=======");
        for(String s : skey){
            System.out.println(s);
        }
        
        System.out.println();
        System.out.println("Capitals:");
        System.out.println("=========");
        for(String s : skey){
            System.out.println(states.get(s));
        }

        System.out.println();
        System.out.println("States/Capital pairs:");
        System.out.println("=====================");
        for(String s : skey){
            System.out.println(s + " - " + states.get(s));
        }
    }

    public static void populateMap(Map<String, String> map){
        try {
            Scanner file = new Scanner(new File("Cities and Captials list.txt"));

            while(file.hasNextLine()){
                String line = file.nextLine();
                String[] thing = line.split(",", 3);

                map.put(thing[0],thing[1]);
            }


            file.close();
        }catch(FileNotFoundException e){
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
