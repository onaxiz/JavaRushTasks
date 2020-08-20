package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;
/*
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> numberSet = new HashSet<>(20);
        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            numberSet.add(rand.nextInt());
        }

        return numberSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            if (iterator.next() > 10 )
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set  = createSet();
        removeAllNumbersGreaterThan10(set);

    }
}
