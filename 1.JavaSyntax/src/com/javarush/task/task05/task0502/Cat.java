package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;


    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int thisCatVin =0;
        int enemyCatVin =0;
        if (this.age!=anotherCat.age || this.weight!=anotherCat.weight
                || this.strength!=anotherCat.strength){

            if (this.age>anotherCat.age) thisCatVin++;
            else enemyCatVin++;

            if (this.strength>anotherCat.strength) thisCatVin++;
            else enemyCatVin++;

            if (thisCatVin>enemyCatVin) return true;
            else return false;

        }
        else return false;
    }
    public static void main(String[] args) {
    }
}
