package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int  amountOfPositive = 0;
        int  amountOfNegative = 0;
        for(int i=0; i<3; i++){
            int number = Integer.parseInt(reader.readLine());
            amountOfPositive=countPositive(number, amountOfPositive);
            amountOfNegative=countNegative(number,amountOfNegative);
        }
        System.out.println("количество отрицательных чисел: "+amountOfNegative);
        System.out.println("количество положительных чисел: "+amountOfPositive);

    }

    private static int countPositive(int number, int amountP) {
        if (isPositive(number))  amountP++;
        return  amountP;
    }
    private static int countNegative(int number, int amountN) {
        if (isNegative(number))  amountN++;
        return amountN;
    }
    public static boolean isPositive(int number){
        if(number>0) return true;
        else return false;
    }
    public static boolean isNegative(int number){
        if(number<0) return true;
        else return false;
    }
}

class Cat{
    static  int amount=0;
}

