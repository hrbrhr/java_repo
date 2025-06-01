package org.javaguru.student_pavel_gorev.lesson_3.level_7.task2;

class BankAccount {

    private String owner;
    private int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}