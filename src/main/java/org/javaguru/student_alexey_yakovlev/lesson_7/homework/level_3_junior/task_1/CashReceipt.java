package org.javaguru.student_alexey_yakovlev.lesson_7.homework.level_3_junior.task_1;

class CashReceipt {

    private String checkNumber;
    private double sumPurchase;

    public CashReceipt(String checkNumber, double sumPurchase) {
        this.checkNumber = checkNumber;
        this.sumPurchase = sumPurchase;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public double getSumPurchase() {
        return sumPurchase;
    }
}
