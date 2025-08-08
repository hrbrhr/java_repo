package org.javaguru.student_grigoriy_emiliyanov.lesson_15_multithreading.homework;

class HelloWorldThread implements Runnable {
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().threadId() + "] " + "Hello World");
    }
}
