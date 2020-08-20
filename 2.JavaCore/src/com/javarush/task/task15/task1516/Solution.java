package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

import java.io.IOException;

public class Solution {

    public  int intVar;
    public  double doubleVar;
    public  Double DoubleVar;
    public  boolean booleanVar = false;
    public  Object ObjectVar = null;
    public  Exception ExceptionVar = null;
    public  String StringVar = null;


    public static void main(String[] args) {

        Solution newSol = new Solution();

        System.out.println(newSol.intVar);
        System.out.println(newSol.doubleVar);
        System.out.println(newSol.DoubleVar);
        System.out.println(newSol.booleanVar);
        System.out.println(newSol.ObjectVar);
        System.out.println(newSol.ExceptionVar);
        System.out.println(newSol.StringVar);
    }
}
