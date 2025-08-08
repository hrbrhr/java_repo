package org.javaguru.student_grigoriy_emiliyanov.lesson_15_multithreading.lessoncode;

public class BankMultiThreadDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);

        Thread thread1 = new Thread(new AddMoneyThread(bankAccount));
        Thread thread2 = new Thread(new RemoveMoneyThread(bankAccount));
        thread1.start();
        thread2.start();

        long start = System.currentTimeMillis();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        long end = System.currentTimeMillis();
        System.out.println(bankAccount.getMoney());
        System.out.println("Time in microsec: " + (end - start) * 1000.0);
    }
}
