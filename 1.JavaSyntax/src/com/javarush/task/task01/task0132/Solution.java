package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int hundred = number/100;
        int dec = (number/10)%10;
        int one = number%10;
        int sum = hundred+dec+one;

        return sum;
    }
}