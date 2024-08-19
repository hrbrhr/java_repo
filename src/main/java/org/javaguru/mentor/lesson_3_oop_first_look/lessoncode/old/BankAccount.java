package org.javaguru.mentor.lesson_3_oop_first_look.lessoncode.old;

class BankAccount {

    private String ownerName;
    private int moneyAmount;

    public BankAccount(String ownerName, int moneyAmount) {
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getMoneyAmount() {
        return this.moneyAmount;
    }

}
