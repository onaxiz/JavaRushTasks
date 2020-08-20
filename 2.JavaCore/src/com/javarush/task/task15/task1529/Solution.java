package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //add your code here - добавьте код тут
        String str = null;
        int passangers = 0;

        try {
           str = reader.readLine();

        } catch (Exception e){
            e.printStackTrace();
        }
        if (str.equals("helicopter")){
            result = new Helicopter();
        } else if (str.equals("plane")){
            try {
                passangers = Integer.parseInt(reader.readLine());
                result = new Plane(passangers);
                reader.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
