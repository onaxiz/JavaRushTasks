package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //InputStream inStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader
                (new FileInputStream(reader.readLine())));


        while (fileReader.ready())
        {
            int date = Integer.parseInt(fileReader.readLine());
            if (date % 2 == 0){
                list.add(date);
            }

        }

        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }
        reader.close();
        fileReader.close();
    }
}
