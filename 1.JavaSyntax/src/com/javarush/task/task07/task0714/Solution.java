package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> wordList = new ArrayList<>();

        int thisMustBeDelete = 2;

        for (int i = 0; i < 5; i++){
            wordList.add((reader.readLine()));
        }

        wordList.remove(thisMustBeDelete);

        for (int i = 3; i >= 0; i--){
            System.out.println(wordList.get(i));
        }


    }
}
