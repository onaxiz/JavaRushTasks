package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int input = Integer.parseInt(reader.readLine());
        while (input > 150){
            input = Integer.parseInt(reader.readLine());
        }
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {

        String result = "";
        BigInteger fact = BigInteger.ONE;
        if (n > 1){
            for (int i = 1; i <= n; i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            return result + fact;
        }
        else if (n < 0) {
            return result + 0;
        }
        else {
            return result + 1;
        }

    }
}
