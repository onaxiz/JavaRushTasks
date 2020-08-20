package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strInput = reader.readLine();
        String str = "";
        char[] input;

        ArrayList<String> vowels = new ArrayList<>();
        ArrayList<String> others = new ArrayList<>();

        for (String s : strInput.split(" ")) {
            str = str.concat(s);
        }
        input = str.toCharArray();
        
        for (int i = 0; i < input.length; i++) {
            if (isVowel(input[i])){
                vowels.add(input[i] + " ");
            }
            else {
                others.add(input[i] + " ");
            }
        }

        for (String vowel : vowels) {
            System.out.print(vowel);
        }
        System.out.println();

        for (String other : others) {
            System.out.print(other);
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}