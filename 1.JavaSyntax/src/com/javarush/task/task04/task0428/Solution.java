package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;




public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int amountOfPositive=0;
        for(int i=0; i<3; i++){
            int number = Integer.parseInt(reader.readLine());
            amountOfPositive=countPositive(number, amountOfPositive);
        }
        System.out.println(amountOfPositive);

    }

    private static int countPositive(int number, int amount) {
        if (isPositive(number)) amount++;
        return amount;
    }
    public static boolean isPositive(int number){
        if(number>0) return true;
        else return false;
    }
}
