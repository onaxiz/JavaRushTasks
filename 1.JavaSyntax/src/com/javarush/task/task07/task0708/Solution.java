package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<String>();
        ArrayList<String> onlyLong = new ArrayList<String>();
        for(int i=0; i<5; i++){
            strings.add(reader.readLine());
        }

        String tmp = strings.get(0);
        for (int i=0; i<5; i++){
                if(strings.get(i).length()>tmp.length()) {
                    tmp=strings.get(i);
                }
        }
        for (int i=0; i<5; i++){
            if(strings.get(i).length()==tmp.length()){
                onlyLong.add(strings.get(i));
            }
        }
        for (int i=0; i<onlyLong.size(); i++){
            System.out.println(onlyLong.get(i));
        }
    }
}
