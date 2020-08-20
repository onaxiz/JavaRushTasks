package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        ArrayList<String> myArr = new ArrayList<String>();
        myArr.add("mrnesli");
        myArr.add("картошка");
        myArr.add("пюрешка");
        myArr.add("котлетка");
        myArr.add("последняя");
        System.out.println(myArr.size());
        for (int i=0; i<5; i++){
            System.out.println(myArr.get(i));
        }

    }
}
