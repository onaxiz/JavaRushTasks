package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        /**
         * Returns a string representation of this thread, including the
         * thread's name, priority, and thread group.
         *
         * @return a string representation of this thread.
         */
        @Override
        public String toString() {
            return this.getName() + " created";
        }

        public GenerateThread(){
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run()
        {
            if (createdThreadCount < count) {
                System.out.println(new GenerateThread());
            }
        }
    }
}
