package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

           int a = Integer.parseInt(reader.readLine());
           int b = Integer.parseInt(reader.readLine());

           if ((a > 0) && (b > 0)) {
               System.out.println(nod(b, (a % b)));
           }
           else {
               throw new Exception();
           }
    }

    public static int nod(int a, int b){
        if (b == 0) return a;

        return nod(b, a % b);
    }
}
