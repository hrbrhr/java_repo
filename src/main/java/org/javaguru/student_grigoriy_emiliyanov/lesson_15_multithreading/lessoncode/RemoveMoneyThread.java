package org.javaguru.student_grigoriy_emiliyanov.lesson_15_multithreading.lessoncode;

class RemoveMoneyThread implements Runnable {
    private BankAccount bankAccount;

    public RemoveMoneyThread(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            bankAccount.remove(1);
        }
    }
}
