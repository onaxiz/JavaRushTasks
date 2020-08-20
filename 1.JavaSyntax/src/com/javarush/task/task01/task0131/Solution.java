package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код
        int metre = centimetre/100;
        return metre;
    }
}