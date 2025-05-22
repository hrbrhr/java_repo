package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_7_senior;

class BankAccount {
    private String owner;
    private int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
