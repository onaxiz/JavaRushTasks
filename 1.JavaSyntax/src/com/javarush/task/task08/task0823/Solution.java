package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringJoiner;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myString = reader.readLine(), emptyString = "";
        emptyString = emptyString + myString.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < myString.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(myString.substring(i-1, i)))
                emptyString = emptyString + myString.substring(i, i+1).toUpperCase();
            else
                emptyString = emptyString + myString.substring(i, i+1);
        }

        System.out.println(emptyString);

        /*
        
        StringJoiner joiner = new StringJoiner(" ");
        String string = reader.readLine();
        ArrayList<String> strList = new ArrayList<>();
        for (String retval : string.split(" ")) {
            strList.add(retval);
        }
        for (int i = 0; i < strList.size(); i++) {
                char[] chars = strList.get(i).toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);
                strList.set(i, String.valueOf(chars)) ;
        }


                String joined = String.join("/", "2014", "10", "28" ); // "2014/10/28"

             // join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
                List<String> list = Arrays.asList("foo", "bar", "baz");
                joined = String.join(";", list); // «foo;bar;baz"


        for (int i = 0; i < strList.size(); i++) {
            joiner.add(strList.get(i));
        }

        System.out.println(joiner.toString());
        */

    }
}
