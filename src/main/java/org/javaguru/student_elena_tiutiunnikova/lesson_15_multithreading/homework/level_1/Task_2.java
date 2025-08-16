package org.javaguru.student_elena_tiutiunnikova.lesson_15_multithreading.homework.level_1;

class Task_2 {
//    Напишите программу, которая запускает 5 дополнительных потоков,
//    в каждом из которых печатает на консоль текст "Hello World".
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                System.out.println("Hello World");
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

