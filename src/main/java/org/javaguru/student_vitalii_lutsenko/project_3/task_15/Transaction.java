package org.javaguru.student_vitalii_lutsenko.project_3.task_15;

class Transaction {

    private Trader trader;
    private int amount;

    //Создайте конструктор для класса Transaction, через который
    //можно установить начальные значения всем свойствам класса.

    public Transaction(Trader trader, int amount){
        this.trader = trader;
        this.amount = amount;
    }
    //Создайте в классе Transaction get методы для всех свойств класса.
    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}
