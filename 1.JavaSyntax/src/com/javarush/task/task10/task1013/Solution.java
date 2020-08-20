package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String gender;
        private int age;
        private Human mother;
        private Human father;
        private Boolean job;

        public Human(String name, String gender, int age, Human mother, Human father, Boolean job) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.mother = mother;
            this.father = father;
            this.job = job;
        }

        public Human(String name, String gender, int age, Human mother, Human father) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String gender, int age, Human mother) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.mother = mother;
        }
        public Human(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public Human(String name, String gender) {
            this.name = name;
            this.gender = gender;

        }

        public Human(String gender) {

            this.gender = gender;

        }

        public Human(String gender, int age) {

            this.gender = gender;
            this.age = age;

        }

        public Human(int age, Human mother, Human father) {
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String gender, int age, Boolean job) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.job = job;
        }

        public Human(String name, Human mother, Human father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }
    }
}
