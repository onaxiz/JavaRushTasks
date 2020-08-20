package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        //Два дедушки, две бабушки, отец, мать, трое детей.

        Human ded1 = new Human("Гена", true, 76);
        Human baba1 = new Human("Алла", false, 76);
        Human ded2 = new Human("Гена2", true, 76);
        Human baba2 = new Human("Алла2", false, 76);
        Human mather = new Human("Ольга", false, 36, ded1, baba1);
        Human father = new Human("Cthutq", true, 40, ded2, baba2);
        Human son1 = new Human("SON", true, 2, father, mather );
        Human son2 = new Human("SON2", true, 2, father, mather );
        Human son3 = new Human("SON3", true, 2, father, mather );

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println( baba2.toString());
        System.out.println(mather.toString());
        System.out.println(father.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());

    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private int age;
        private boolean sex;
        Human mother;
        Human father;


        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}