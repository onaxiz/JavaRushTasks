package com.javarush.task.task05.task0530;

/* 
Шеф, что-то не пашет
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("Sum = " + sum);
    }
}
