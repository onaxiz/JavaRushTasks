package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Ребенок1", 15, true );
        Human child2 = new Human("Ребенок2", 3, true );
        Human child3 = new Human("Ребенок3", 8, true );
        Human mama = new Human("Мама", 34, true, child1, child2, child3);
        Human papa = new Human("Папа", 34, true, child1, child2, child3);
        Human ded1 = new Human("Дед1", 75, true, mama );
        Human ded2 = new Human("Дед2", 75, true, papa);
        Human baba1 = new Human("Бабка1", 75, false, mama);
        Human baba2 = new Human("Бабка2", 75, false, papa);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mama);
        System.out.println(papa);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, int age, boolean sex, Human child1){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(child1);
        }
        public Human(String name, int age, boolean sex, Human child1, Human child2, Human child3){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(child1);

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(child2);

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children.add(child3);
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
