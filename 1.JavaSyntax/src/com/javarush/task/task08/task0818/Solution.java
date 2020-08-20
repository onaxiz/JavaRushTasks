package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Random rand = new Random();

        Map<String, Integer> map = new HashMap<>();

        String[] secondNames = new String[]{"Петров", "Иванов", "Сидоров", "Пупкин",
                "Пушкин", "Говнов", "Михин", "Бубнов", "Бараусов", "Жилин"};

        int[] salary = new int[]{500, 400, 300, 800};
        for (int i = 0; i < 10; i++) {
            map.put(secondNames[i], salary[rand.nextInt(salary.length)]);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copyMap = new HashMap<>(map);

        for (Map.Entry<String, Integer> stringIntegerEntry : copyMap.entrySet()) {
            if (stringIntegerEntry.getValue() < 500) {
                map.remove(stringIntegerEntry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
    }
}