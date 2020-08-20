package com.javarush.task.task05.task0528;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
Вывести на экран сегодняшнюю дату
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd MM yyyy");
        System.out.println(f.format(d));

    }
}
