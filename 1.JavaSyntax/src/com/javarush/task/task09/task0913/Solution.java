package com.javarush.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Исключения. Просто исключения.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        }
        catch (NullPointerException e){

        }
        catch (FileNotFoundException e2){

        }


        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, FileNotFoundException, ArithmeticException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
