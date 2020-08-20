package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 сЛов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> mySet = new HashSet<String>(20);
        mySet.add("Лебедь");
        mySet.add("Ловушка");
        mySet.add("Любовь");
        mySet.add("Ласка");
        mySet.add("Лимб");
        mySet.add("Лосось");
        mySet.add("Луноход");
        mySet.add("Ламповость");
        mySet.add("Лишай");
        mySet.add("Ломка");
        mySet.add("Лобок");
        mySet.add("Лупа");
        mySet.add("Лось");
        mySet.add("Лихорадка");
        mySet.add("Лоб");
        mySet.add("Лавочка");
        mySet.add("Лодка");
        mySet.add("Ласточка");
        mySet.add("Ложка");
        mySet.add("Ларёк");
        //mySet.add("Лимон");
        return mySet;
    }

    public static void main(String[] args) {
            HashSet<String> mySet = (HashSet<String>) createSet();
            
    }
}
