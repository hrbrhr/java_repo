package org.javaguru.student_grigoriy_emiliyanov.lesson_15_multithreading.homework;

class NotThreadSafeIdGeneratorDemo {
    public static void main(String[] args) {
        NotThreadSafeIdGenerator generator = new NotThreadSafeIdGenerator();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(generator.nextId());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(generator.nextId());
            }
        });
        thread1.start();
        thread2.start();
    }
}
