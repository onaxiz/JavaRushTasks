package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fin = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        String data;
        while (fin.available() > 0){

            System.out.print((char) fin.read());
        }

        reader.close();
        fin.close();

    }
}