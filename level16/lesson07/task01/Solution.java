package com.javarush.test.level16.lesson07.task01;

/* Часы
1. Разберись, что делает программа.
2. Реализуйте логику метода printTikTak:
2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik.
2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak.
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("Clock has to be stopped");
        Thread.sleep(1000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    sleep(500);
                    printTikTak();

                }
            } catch (InterruptedException e) {
            }
        }
        public int count = 1;
        private void printTikTak() throws InterruptedException {
            //add your code here - добавь код тут\
           count ++;
            if(count%2 == 0)
            System.out.println("Tik");
            else
                System.out.println("Tak");

        }
    }
}
