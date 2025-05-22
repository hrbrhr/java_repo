package org.javaguru.student_anastassija.lesson_3;

class BankAccount {


    private String owner;
    private int money;

    public BankAccount() {

    }

    public BankAccount(String owner, int money) {
        this.owner = owner; //ukazatel na svoistvo objekta "owner" (Private String owner)
        this.money = money; //ukazatel na svoistvo objekta "money" (Private String owner)
    }

    public BankAccount(int money) {
        this.money = money;

    }

    public String getOwner(){
        return this.owner;
    }

    public int getMoney(){
        return this.money;

    }
}
