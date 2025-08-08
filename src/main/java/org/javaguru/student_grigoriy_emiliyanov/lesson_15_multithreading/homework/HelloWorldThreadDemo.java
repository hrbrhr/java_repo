package org.javaguru.student_grigoriy_emiliyanov.lesson_15_multithreading.homework;

class HelloWorldThreadDemo {
    public static void main(String[] args) {
        startSingleThread();
        System.out.println("-----");
        start5Threads();
    }

    public static void startSingleThread() {
        Thread thread = new Thread(new HelloWorldThread(), "Thread22");
        thread.start();
        System.out.println("Hello World from Main Thread!!!");
    }

    public static void start5Threads() {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new HelloWorldThread());
            thread.start();
        }
    }
}
