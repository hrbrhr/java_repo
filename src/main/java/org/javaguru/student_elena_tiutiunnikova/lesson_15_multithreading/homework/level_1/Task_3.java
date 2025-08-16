package org.javaguru.student_elena_tiutiunnikova.lesson_15_multithreading.homework.level_1;

class Task_3 {
//    Внесите изменения в программу из предыдущего задания.
//    При распечатке на консоль текста "Hello World" поток
//    должен печатать свой уникальный номер.

public static void main(String[] args) {
        Thread[] threads = new Thread[5];

    for (int i = 0; i < 5; i++) {
            final int number = i + 1;
            threads[i] = new Thread(() -> {
                System.out.println(number + " Hello World");
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

