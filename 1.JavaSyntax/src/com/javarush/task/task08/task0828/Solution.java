package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> month = new HashMap<>();

        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);


        String yourMonth = reader.readLine();
        for (Map.Entry<String, Integer> pair : month.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (key.equals(yourMonth)) {
                System.out.println(key + " is the " + value + " month");
            }
        }
        //напишите тут ваш код
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthName = reader.readLine();
        String lowMonthName = monthName.toLowerCase();
        HashMap<String, Integer> monthMap = new HashMap<>();
        for (int i = 0; i < 11; i++){
            monthMap.put(getMonth(i).toLowerCase(), i+1);
        }
        for ( HashMap.Entry<String, Integer> pair : monthMap.entrySet()){
            if(pair.getKey().equalsIgnoreCase(lowMonthName)){
                System.out.println(monthName +" is the " + pair.getValue() + " month");
            }
        }*/
    }

    /*
    public static String getMonth( int month){
        return new DateFormatSymbols(Locale.ENGLISH).getMonths()[month];
    }*/
}
