package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.lessoncode.task_1_6_plus;

class BankAccount {
    private String owner;
    private int money;

    BankAccount() {
        this.owner = "Default name";
        this.money = 0;
    }
    BankAccount(String owner) {
        this.owner = owner;
        this.money = 0;
    }
    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {return owner;}
    int getMoney()    {return money;}

    void setOwner(String newOwner) {this.owner = newOwner;}
    void setMoney(int newMoney)    {this.money = newMoney;}

}
