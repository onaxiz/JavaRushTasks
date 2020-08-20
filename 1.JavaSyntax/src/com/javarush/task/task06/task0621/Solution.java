package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String dadName = reader.readLine();
        Cat dad = new Cat (dadName, null, catGrandpa);

        String momName = reader.readLine();
        Cat mom = new Cat(momName, catGrandma, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mom, dad);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mom, dad);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son);
        System.out.println(daughter);

        /*
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, );

        System.out.println(catMother);
        System.out.println(catDaughter);*/
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }


        @Override
        public String toString() {

            if (mother == null && father==null)
                return "The cat's name is "+name+", no mother, no father ";
            else if (father==null)
                return "The cat's name is "+name+", mother is " +mother.name + ", no father ";
            else if (mother==null)
                return "The cat's name is "+name+", no mother"+", father is " + father.name;
            else
                return "The cat's name is "+name+", mother is " +mother.name+", father is " + father.name;

        }
    }

}
