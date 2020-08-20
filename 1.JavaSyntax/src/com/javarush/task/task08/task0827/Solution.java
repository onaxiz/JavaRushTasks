package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        cal.setTime(df.parse(date));
        int amountOfDays = cal.get(Calendar.DAY_OF_YEAR);
        if (amountOfDays % 2 == 1){
            return true;
        }
        else return false;

    }
}
