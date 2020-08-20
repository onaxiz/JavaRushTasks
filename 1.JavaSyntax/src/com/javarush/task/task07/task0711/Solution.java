package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        ArrayList<String> myArr = new ArrayList<String>();
        for(int i=0; i<5; i++){
            myArr.add(reader.readLine());
        }
        for(int i=0; i<13; i++) {
            String tmp = myArr.get(4);
            myArr.remove(4);
            myArr.add(0, tmp);
        }
        for (int i=0; i<5; i++){
            System.out.println(myArr.get(i));
        }
    }
}
