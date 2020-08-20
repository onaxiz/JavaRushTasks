package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int[] bigArr = new int[20];
        int[] smallArr1= new int[10];
        int[] smallArr2 = new int[10];

        for(int i=0; i<20; i++){
            bigArr[i] =Integer.parseInt(reader.readLine());
        }
        for (int i=0; i<10; i++){
            smallArr1[i]=bigArr[i];
        }
        for (int j=0; j<10; j++) {
            smallArr2[j] = bigArr[j+10];
            System.out.println(smallArr2[j]);

        }

    }
}
