package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class Transaction {
    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTrader() { return trader; }
    int getAmount()    { return amount; }
}
