package com.javarush.task.task16.task1601;

/* 
My first thread
*/

public class Solution {

    public static class TestThread implements Runnable{

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
}
