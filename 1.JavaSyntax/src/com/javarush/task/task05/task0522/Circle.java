package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Circle(){
        this.x=2;
        this.y=2;
        this.radius=2;
    }
    public Circle(Circle other){
        this.x=other.x;
        this.y=other.y;
        this.radius=other.radius;
    }

    public Circle(int coordinate){
        this.x=coordinate;
        this.y=coordinate;
        this.radius=coordinate;
    }

    public Circle(int x, int y, int radius){
        this.radius=radius;
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {

    }
}