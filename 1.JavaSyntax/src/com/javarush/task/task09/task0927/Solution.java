package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> catsMap = new HashMap<>();
        Random rand = new Random();


        catsMap.put("Барсик", new Cat("Барсик"));
        catsMap.put("Мурзик", new Cat("Барсик"));
        catsMap.put("Кузя", new Cat("Барсик"));
        catsMap.put("Беляшик", new Cat("Барсик"));
        catsMap.put("Том", new Cat("Барсик"));
        catsMap.put("Маркиз", new Cat("Барсик"));
        catsMap.put("Аристарх", new Cat("Барсик"));
        catsMap.put("Филипп", new Cat("Барсик"));
        catsMap.put("Бобик", new Cat("Барсик"));
        catsMap.put("Шарик", new Cat("Барсик"));

        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> catsSet = new HashSet<Cat>(map.values());

        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
