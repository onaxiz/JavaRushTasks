package com.javarush.task.task03.task0325;

/* 
Финансовые ожидания
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String salary = reader.readLine();
        System.out.println("Я буду зарабатывать $"+salary+" в час");
    }
}
