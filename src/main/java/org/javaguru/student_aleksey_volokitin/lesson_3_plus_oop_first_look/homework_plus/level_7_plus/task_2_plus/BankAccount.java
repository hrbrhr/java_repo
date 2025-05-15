package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_7_plus.task_2_plus;

class BankAccount {
    private String owner;
    private int moneyAmount;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmount = moneyAmount;
    }

    String getOwner() {return this.owner;}
    int getMoney()    {return this.moneyAmount;}
}
