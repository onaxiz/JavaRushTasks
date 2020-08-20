package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = "";

        try {

            url = reader.readLine();
            reader.close();

        } catch (Exception e){
            e.printStackTrace();
        }
        int index = url.indexOf('?');
        String restOfUrl = url.substring(index + 1);
        ArrayList<String> list = new ArrayList<>();

        for (String temp : restOfUrl.split("&")) {
            list.add(temp);
        }

        for (String str : list) {
            index = str.indexOf("=");
            if (index > 0) {
                str = str.substring(0, index);
                System.out.print(str + " ");
            }
            else if (!str.contains("=")) {
                System.out.print(str + " ");
            }
        }
        System.out.println();

        String obj = "";
        for (String str : list) {
            if (str.contains("obj")) {
                index = str.indexOf("=");
                try {
                    obj = str.substring(index + 1);
                    Double value = Double.parseDouble(obj);
                    alert(value);
                }catch (Exception e) {
                    alert(obj);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
