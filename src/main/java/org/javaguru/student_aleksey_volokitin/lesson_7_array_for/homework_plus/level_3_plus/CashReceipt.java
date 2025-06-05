package org.javaguru.student_aleksey_volokitin.lesson_7_array_for.homework_plus.level_3_plus;

class CashReceipt {
    private int number;
    private double sumPurchase; // сумма покупки

    CashReceipt(int number, double sumPurchase) {
        this.number = number;
        this.sumPurchase = sumPurchase;
    }

    int getNumber()         { return number; }
    double getSumPurchase() { return sumPurchase; }
}
