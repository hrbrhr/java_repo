package org.javaguru.student_elena_tiutiunnikova.lesson_15_multithreading.homework.level_5;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class RandomNumberListTest {
//
//    Напишите программу, которая будет вызывать метод add() со случайно сгенерированными
//    целыми числами из разных потоков. Докажите, что применение простого
//    ArrayList в многопоточной среде не безопасно!
    public static void main(String[] args) throws InterruptedException {
        RandomNumberList list = new RandomNumberList();
        Random random = new Random();

        int threads = 20;
        int adds = 10000;

        ExecutorService executor = Executors.newFixedThreadPool(threads);

        for (int i = 0; i < threads; i++) {
            executor.submit(() -> {
                for (int j = 0; j < adds; j++) {
                    list.add(random.nextInt());
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        int expected = threads * adds;
        int actual = list.size();

        System.out.println("Ожидалось элементов: " + expected);
        System.out.println("Фактически в списке: " + actual);
    }

}
