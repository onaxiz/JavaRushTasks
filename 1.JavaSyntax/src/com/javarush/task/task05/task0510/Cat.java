package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name = null;
    private int age = 0;
    private int weight = 8;
    private String address = null;
    private String color = null;

    public static void main(String[] args) {

    }
    public void initialize(String name){
        this.name=name;
        this.age=3;
        this.weight=8;
        this.color="рыжая";
    }

    public void initialize(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void initialize(String name,  int weight, int age){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color="рыжий";
    }
    public void initialize( int weight, String color){
        this.weight=weight;
        this.color=color;
        this.age=3;
    }
    public void initialize(int weight, String color, String address){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
        this.address=address;
    }
}
