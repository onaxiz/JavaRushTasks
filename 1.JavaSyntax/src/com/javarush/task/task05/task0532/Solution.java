package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int amount = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        amount=Integer.parseInt(reader.readLine());
        if(amount>0) {

            for (int i = 0; i < amount; i++) {
                arrayList.add(Integer.parseInt(reader.readLine()));
            }
            for (int i = 0; i < amount; i++) {
                if (arrayList.get(0) < arrayList.get(i)) arrayList.set(0, arrayList.get(i));
            }

            int maximum = arrayList.get(0);

            //напишите тут ваш код

            System.out.println(maximum);
        }
    }
}
