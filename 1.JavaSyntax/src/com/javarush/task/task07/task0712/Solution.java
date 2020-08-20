package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        String shortString = strings.get(0);
        String longString = strings.get(0);
        int shortIndex = 0;
        int longIndex = 0;


        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() > shortString.length()) {
                shortString = strings.get(i);
                shortIndex = i;
            }
            if (strings.get(i).length() < longString.length()) {
                longString = strings.get(i);
                longIndex = i;
            }
        }
        if (shortIndex < longIndex) System.out.println(shortString);
        else System.out.println(longString);

    }
}