package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> wordList = new ArrayList<>();
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            wordList.add(reader.readLine());
        }

        for (int i = 0; i < 9; i++){
            if(!(wordList.get(i).length() < wordList.get(i+1).length())){
                System.out.println(i+1);
                break;
            }
        }
    }
}

