package com.javarush.task.task09.task0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/*
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код

        Random rand = new Random();

        ArrayList<int[]> result = new ArrayList<>();

        int[] tmp = {5, 2, 4, 7, 0};


        for (int i = 0; i < tmp.length; i++){
            int[] smallMassive = new int[tmp[i]];
            for (int j = 0; j < tmp[i]; j++){
                smallMassive[i] = 0;
            }
            result.add(smallMassive);
        }

        return result;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
