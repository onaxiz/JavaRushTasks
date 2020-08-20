package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Mouse jerry = new Mouse("Jerry", 12, 3);
        Dog  dog = new Dog("dog", "white", 'm');
        Cat cat = new Cat("tom", "grey", 'm');
    }

    public static class Mouse {
        String name;
        int height;
        int tail;


        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat{
        String name;
        String color;
        char sex;

        public Cat(String name, String color, char sex){
            this.name=name;
            this.color=color;
            this.sex=sex;
        }
    }

    public static class Dog{
        String name;
        String color;
        char sex;

        public Dog(String name, String color, char sex){
            this.name=name;
            this.color=color;
            this.sex=sex;
        }
    }

    //напишите тут ваш код
}
