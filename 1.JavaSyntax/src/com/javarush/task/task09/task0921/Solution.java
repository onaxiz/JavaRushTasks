package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int number;
        try {
            while (true) {
                number = Integer.parseInt(reader.readLine());
                list.add(number);
            }
        }
        catch (Exception e){
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
}
