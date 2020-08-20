package com.javarush.task.task06.task0614;

/* 
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>(10);

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i=0; i<10; i++){
            Cat pushok = new Cat();
            cats.add(pushok);
        }

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
            for(int i=0; i<10; i++) System.out.println(cats.get(i));

    }
}
