package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in));
        String[] myArray = new String[10];
        int[] lengthOfArray = new int[10];
        for(int i=0; i<10; i++){
            myArray[i]=reader.readLine();
        }


        for(int i=0; i<10; i++){
            lengthOfArray[i]=myArray[i].length();
            System.out.println(lengthOfArray[i]);
        }
    }
}
