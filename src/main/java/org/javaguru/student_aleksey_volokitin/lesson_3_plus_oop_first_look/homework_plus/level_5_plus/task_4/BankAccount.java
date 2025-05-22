package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_5_plus.task_4;

class BankAccount {
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

    String getOwnerFirstName() {return this.ownerFirstName;}
    String getOwnerLastName() {return this.ownerFirstName;}
    int getMoneyAmount() {return this.moneyAmount;}

}
