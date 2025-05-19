package org.javaguru.student_vitalii_lutsenko.lesson_3.classwork;


class BankAccount {

    private String owner;
    private int money;

    BankAccount() {

    }
    BankAccount(String owner, int money){
     this.owner = owner;
     this.money = money;

    }

    BankAccount(String owner) {
        this.owner = owner;
        this.money = 0;
    }

    BankAccount(int money) {
        this.owner = "VASJA BABLO";
        this.money = money;
    }

    String getOwner() {return this.owner;}

    int getMoney() {return this.money;}




}
