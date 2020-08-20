package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int left, top;
    private int width=0;
    private int height=0;

    public void initialize( int left, int top, int width, int height) {
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=height;
    }

    public void initialize(int left, int top){
        this.left=left;
        this.top=top;
    }

    public void initialize(int left, int top, int width){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=width;
    }

    public void initialize(Rectangle otherObj){
        this.left=otherObj.left;
        this.top=otherObj.top;
        this.width=otherObj.width;
        this.height=otherObj.width;
    }
    public static void main(String[] args) {

    }
}
