package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {

    public static class Cat{

    }

    public static Cat cat;

    static {
        Solution.cat = new Cat();
    }
    public static void main(String[] args) {

    }
}
