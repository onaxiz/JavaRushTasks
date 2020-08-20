package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> statement = new ArrayList<>();

        statement.add("мама");
        statement.add("мыла");
        statement.add("раму");


        for (int i = statement.size(); i > 0 ; i--){
            statement.add(i, "именно");
        }


        for (int i = 0; i < statement.size(); i++){
            System.out.println(statement.get(i));
        }
    }
}
