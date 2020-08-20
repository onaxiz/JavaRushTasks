package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String id = "";
        String name;

        HashMap<String, Integer> map = new HashMap<>();

        while (true){
            id = reader.readLine();
            if(id.equals("")) break;
            name = reader.readLine();
            map.put(name, Integer.parseInt(id));
        }


        for (Map.Entry<String, Integer> pair : map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}
