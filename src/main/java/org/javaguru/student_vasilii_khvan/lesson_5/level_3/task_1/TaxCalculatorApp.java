package org.javaguru.student_vasilii_khvan.lesson_5.level_3.task_1;

class TaxCalculatorApp {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculateTax(5000));
        System.out.println(taxCalculator.calculateTax(12000));
        System.out.println(taxCalculator.calculateTax(57000));
    }
}
