package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>(20);
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        list = doubleValues(list);

        // Вывести на экран result
        for (String elem : list ){
            System.out.println(elem);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> result = new ArrayList<>();
        for (String elem : list){
            result.add(elem);
            result.add(elem);
        }
        return result;
    }
}
