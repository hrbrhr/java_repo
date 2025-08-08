package org.javaguru.student_grigoriy_emiliyanov.lesson_15_multithreading.lessoncode;

class AddMoneyThread implements Runnable {
    private BankAccount bankAccount;

    AddMoneyThread(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            bankAccount.add(1);
        }
    }
}
