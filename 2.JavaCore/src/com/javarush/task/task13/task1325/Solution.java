package com.javarush.task.task13.task1325;

/* 
Компиляция программы
*/

import java.awt.*;

public class Solution {

    public static void main(String[] args) throws Exception {

    }

    public interface Animal {
        Color getColor();
    }

    public  abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public abstract  class BigFox extends Fox{

    }

}
