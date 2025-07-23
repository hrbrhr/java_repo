package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public BankAccount(String owner) {
        this.owner = owner;
        this.money = 0;
    }

    public BankAccount(int money) {
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoneyAmount() {
        return this.money;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setMoneyAmount(int amount) {
        this.money = amount;
    }
}
