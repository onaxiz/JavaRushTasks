package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        //напишите тут ваш код
        String str =reader.readLine();

        while (!(str.equals("end"))){
            strings.add(str);
            str = reader.readLine();
        }

        for (String elem : strings){
            System.out.println(elem);
        }
    }
}