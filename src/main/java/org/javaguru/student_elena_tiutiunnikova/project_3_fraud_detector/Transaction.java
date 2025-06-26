package org.javaguru.student_elena_tiutiunnikova.project_3_fraud_detector;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction (Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}
