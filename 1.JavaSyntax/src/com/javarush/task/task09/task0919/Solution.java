package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void divideByZero(){
            int dev = 2458 / 0;
            System.out.println(dev);
    }
}
