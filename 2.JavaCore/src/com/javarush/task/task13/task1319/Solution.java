package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        String line = null;


        do {
            line = reader.readLine();
            writer.write(line + "\n");
        }
        while (!(line.equals("exit")));


        writer.close();
        reader.close();
    }
}
