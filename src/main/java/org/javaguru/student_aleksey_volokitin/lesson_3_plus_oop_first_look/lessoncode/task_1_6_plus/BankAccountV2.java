package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_1_6_plus;

class BankAccountV2 {
    private String owner;
    private int money;

    BankAccountV2() {

    }
    BankAccountV2(String owner) {
        this.owner = owner;
        this.money = 0;
    }
    BankAccountV2(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {return owner;}
    int getMoney()    {return money;}

    void setOwner(String newOwner) {this.owner = newOwner;}
    void setMoney(int newMoney)    {this.money = newMoney;}

}
