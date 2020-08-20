package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listOfStrings = new ArrayList<>();
        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++){
            listOfStrings.add(reader.readLine());
        }

        for (int i = 0; i < m; i++){
            listOfStrings.add(listOfStrings.get(i));
        }
        for (int i = 0; i < m; i++){
            listOfStrings.remove(listOfStrings.get(0));
        }

        for (int i = 0; i < listOfStrings.size(); i++){
            System.out.println(listOfStrings.get(i));
        }

    }
}
