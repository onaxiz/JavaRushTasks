package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        String[] copyArray = array.clone();

        for (int i = 0; i < array.length; i++){
            if(isNumber(array[i])){
                for(int j = 0; j < copyArray.length; j++) {
                    if (isNumber(copyArray[j])) {
                        if (Integer.parseInt(copyArray[i]) > Integer.parseInt(copyArray[j])) {
                            String tmp = copyArray[i];
                            copyArray[i] = copyArray[j];
                            copyArray[j] = tmp;
                        }
                    }
                }
            }
            else {

                    for (int k = 0; k < array.length; k++) {
                        if (isGreaterThan(copyArray[k], copyArray[i]) && !(isNumber(copyArray[k]))) {
                            String tmp = copyArray[k];
                            copyArray[k] = copyArray[i];
                            copyArray[i] = tmp;
                        }
                    }

            }

        }
        for (int i = 0; i < array.length; i++) {
            array[i] = copyArray[i];
        }
    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
