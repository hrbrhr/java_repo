package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_5;

public class BankAccount {
    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    public String getOwnerLastName () {
        return this.ownerFirstName;
    }

    public int getMoneyAmount () {
        return this.moneyAmount;
    }

}

