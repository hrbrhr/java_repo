package org.javaguru.student_elena_tiutiunnikova.lesson_3.lessoncode;

class BankAccount  {

    private String owner;
    private int money;

    BankAccount(String owner, int money) {
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

