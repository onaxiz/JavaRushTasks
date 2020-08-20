package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> familyMap = new HashMap<>();
        familyMap.put("Иванов", "Иван");
        familyMap.put("Alexandrov", "Alex");
        familyMap.put("Olegov", "Oleg");
        familyMap.put("Markov", "Mark");
        familyMap.put("Konstantinov", "Kostya");
        familyMap.put("Putin", "Vovka");
        familyMap.put("Alinova", "Alina");
        familyMap.put("Antonov", "Anton");
        familyMap.put("Ilinyh", "Ilya");
        familyMap.put("Evgenyev", "Zozo");

        return familyMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int nameNumber = 0;
        Collection<String> firstNameSet = map.values();
        Iterator<String> iterator = firstNameSet.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(name)){
                nameNumber++;
            }
        }
        return nameNumber;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int SecondNameNumber = 0;
        Set<String> firstNameSet = map.keySet();
        Iterator<String> iterator = firstNameSet.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(lastName)){
                SecondNameNumber++;
            }
        }
        return SecondNameNumber;

    }

    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        int nameNum = getCountTheSameFirstName(myMap, "Vovka");
        int secondNameNum = getCountTheSameFirstName(myMap, "Putin");
    }
}
