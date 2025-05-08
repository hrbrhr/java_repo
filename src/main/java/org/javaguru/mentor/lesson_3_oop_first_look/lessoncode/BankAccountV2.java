package org.javaguru.mentor.lesson_3_oop_first_look.lessoncode;

class BankAccountV2 {

    private String owner;
    private int money;

    BankAccountV2() {

    }

    BankAccountV2(String owner) {
        this.owner = owner;
        this.money = 0;
    }

    BankAccountV2(int money) {
        this.owner = "VASJA HGFFGD";
        this.money = money;
    }

    BankAccountV2(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }
}
