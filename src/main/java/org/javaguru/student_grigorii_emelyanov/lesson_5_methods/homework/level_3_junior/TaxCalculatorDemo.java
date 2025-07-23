package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.homework.level_3_junior;

class TaxCalculatorDemo {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println("Income 9999, tax = " + taxCalculator.calculateTax(9999));
        System.out.println("Income 10001, tax = " + taxCalculator.calculateTax(10001));
        System.out.println("Income 49000, tax = " + taxCalculator.calculateTax(49000));
        System.out.println("Income 51000, tax = " + taxCalculator.calculateTax(51000));
    }
}
