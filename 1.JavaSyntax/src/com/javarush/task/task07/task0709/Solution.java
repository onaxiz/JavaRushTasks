package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        
        ArrayList<String> onlyShort = new ArrayList<String>();
        
        for(int i=0; i<5; i++){
            strings.add(reader.readLine());
        }

        String tmp = strings.get(0);
        for (int i=0; i<5; i++){
            if(strings.get(i).length()<tmp.length()) {
                tmp=strings.get(i);
            }
        }
        for (int i=0; i<5; i++){
            if(strings.get(i).length()==tmp.length()){
                onlyShort.add(strings.get(i));
            }
        }
        for (int i=0; i<onlyShort.size(); i++){
            System.out.println(onlyShort.get(i));
        }
    }
    
}
