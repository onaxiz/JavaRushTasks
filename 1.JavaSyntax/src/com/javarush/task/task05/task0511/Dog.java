package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код

    private String name;
    private int height;
    private String color;

    public static void main(String[] args) {

    }
    public void initialize(String name){
        this.name=name;
    }
    public void initialize(String name, int height){
        this.name=name;
        this.height=height;
    }
    public void initialize(String name, int height, String color){
        this.name=name;
        this.height=height;
        this.color=color;
    }
}
