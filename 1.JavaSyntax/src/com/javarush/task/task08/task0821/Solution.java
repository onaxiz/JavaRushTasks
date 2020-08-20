package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Random rand = new Random();

        Map<String, String> map = new HashMap<>();

        String[] secondNames = new String[]{"Петров", "Иванов", "Сидоров", "Пупкин"};

        String[] names = new String[]{ "Петя", "Ваня", "Серёжа", "Саша"};
        for (int i = 0; i < 10; i++) {
            map.put(secondNames[rand.nextInt(names.length)], names[rand.nextInt(names.length)]);
        }

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
