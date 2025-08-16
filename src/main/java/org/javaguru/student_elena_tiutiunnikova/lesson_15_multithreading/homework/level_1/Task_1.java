package org.javaguru.student_elena_tiutiunnikova.lesson_15_multithreading.homework.level_1;

class Task_1 {
//    Напишите программу, которая печатает на консоль текст "Hello World"
//    из дополнительного потока.
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("Hello World");
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
