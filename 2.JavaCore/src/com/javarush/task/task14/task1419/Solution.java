package com.javarush.task.task14.task1419;

import java.awt.datatransfer.MimeTypeParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

/* 
Нашествие исключений
*/

public class Solution {

    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] myArr = new int[3];
            for(int i = 0; i < 5; i++){
                myArr[i] = i;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            exceptions.add(e);
        }

        exceptions.add(new RuntimeException());
        exceptions.add(new IOException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new MimeTypeParseException());
        exceptions.add(new UnsupportedOperationException());
        exceptions.add(new SecurityException());
        exceptions.add(new DataFormatException());
        //напишите тут ваш код

    }
}
