package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        int a = 1/0;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
