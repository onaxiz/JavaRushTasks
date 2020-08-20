package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Random rand = new Random();

        Map<String, String> map = new HashMap<>();

        String[] secondNames = new String[]{"Петров", "Иванов", "Сидоров", "Пупкин",
                "Пушкин", "Говнов", "Михин", "Бубнов", "Бараусов", "Жилин"};

        String[] names = new String[]{ "Петя", "Ваня", "Серёжа", "Саша"};
        for (int i = 0; i < 10; i++) {
            map.put(secondNames[i], names[rand.nextInt(names.length)]);
        }

        /*
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copyMap = new HashMap<>(map);
        int count = 0;
        String name = "";
        ArrayList<String> namesForDelete = new ArrayList<>();

        for (Map.Entry<String, String> elemName : map.entrySet()){
            name = elemName.getValue();
            for (Map.Entry<String, String> elem : copyMap.entrySet()) {
                if (elem.getValue().equals(name)) {
                    count++;
                }
            }
            if (count>1){
                namesForDelete.add(name);
            }
            count = 0;
        }

        for (String s : namesForDelete) {
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = (HashMap<String, String>) createMap();
        removeTheFirstNameDuplicates(map);
    }
}
