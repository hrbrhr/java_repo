package org.javaguru.student_vitalii_lutsenko.lesson_7.homework.level_3;

public class CashReceipt {

    private String checkNumber;
    private double purchaseAmount;

    public CashReceipt(String checkNumber, double purchaseAmount) {
        this.checkNumber = checkNumber;
        this.purchaseAmount = purchaseAmount;
    }

    public String getNumber() {
        return checkNumber;
    }

    public double getAmount() {
        return purchaseAmount;
    }


}
