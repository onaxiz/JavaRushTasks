package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] people = new int[15];
        int oddSum =0; //неч
        int evenSum =0;

        for (int i=0; i<15; i++){
            people[i]=Integer.parseInt(reader.readLine());
            if (i%2==0) evenSum+=people[i];
            else oddSum+=people[i];
        }
        if (oddSum>evenSum) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
