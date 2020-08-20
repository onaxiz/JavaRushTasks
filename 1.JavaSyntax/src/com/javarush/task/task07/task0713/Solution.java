package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> dev3 = new ArrayList<Integer>();
        ArrayList<Integer> dev2 = new ArrayList<Integer>();
        ArrayList<Integer> dev = new ArrayList<Integer>();

        for (int i=0; i<20; i++){
            input.add(Integer.parseInt(reader.readLine()));
        }
        
        for (int i=0; i<input.size(); i++){
            if (input.get(i)%3==0) dev3.add(input.get(i));
            if (input.get(i)%2==0) dev2.add(input.get(i));
            if (!(input.get(i)%3==0) && !(input.get(i)%2==0)) dev.add(input.get(i));
        }
        printList(dev3);
        printList(dev2);
        printList(dev);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
