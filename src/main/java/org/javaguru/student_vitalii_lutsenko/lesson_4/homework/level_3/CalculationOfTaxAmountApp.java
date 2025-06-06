package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_3;

public class CalculationOfTaxAmountApp {

    public static void main(String[] args) {

        CalculationOfTaxAmount calculationOfTaxAmount = new CalculationOfTaxAmount();

        System.out.println("9000 - " + calculationOfTaxAmount.calculateTax(9000));
        System.out.println("32000 - " + calculationOfTaxAmount.calculateTax(32000));
        System.out.println("60000 - " + calculationOfTaxAmount.calculateTax(60000));
    }
}
