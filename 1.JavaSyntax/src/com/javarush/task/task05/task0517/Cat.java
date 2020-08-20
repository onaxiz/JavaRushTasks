package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String color;
    private String address;

    public  Cat (String name){
        this.name=name;
        this.age=3;
        this.weight=5;
        this.color="черный";
        this.address=null;
    }

    public  Cat (String name, int age){
        this.name=name;
        this.age=age;
        this.weight=3;
        this.color="черный";
        this.address=null;
    }
    public  Cat (int weight, String color){
        this.color=color;
        this.weight=weight;
        this.address=null;
        this.age=2;
        this.name=null;
    }

    public  Cat (String name, int weight, int age){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color="черный";
        this.address=null;
    }

    public  Cat (int weight, String color, String address){
        this.color=color;
        this.weight=weight;
        this.address=address;
        this.name=null;
        this.age=3;
    }
    public static void main(String[] args) {

    }
}
