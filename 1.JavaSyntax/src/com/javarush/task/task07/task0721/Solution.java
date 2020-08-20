package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        int[] myArray = getInts();
        int maximum = myArray[0];
        int minimum = myArray[0];

        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] < minimum) minimum = myArray[i];
            else if (myArray[i] > maximum) maximum = myArray[i];
        }
        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] resultArray = new int[20];
        for (int i = 0; i < resultArray.length; i++){
            resultArray[i]=Integer.parseInt(reader.readLine());
        }
        return resultArray;
    }
}
