package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("упор");
        strings.add("рассол");


        strings = fix(strings);


        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++){

            if (strings.get(i).contains("р") && strings.get(i).contains("л")){
                result.add(strings.get(i));
            }
            else if (strings.get(i).contains("р")){}
            else if (strings.get(i).contains("л")) {
                result.add(strings.get(i));
                result.add(strings.get(i));
            }
            else { result.add(strings.get(i));}
        }
        return result;
    }
}