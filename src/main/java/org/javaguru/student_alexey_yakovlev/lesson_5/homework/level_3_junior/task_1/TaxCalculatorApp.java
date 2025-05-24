package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_3_junior.task_1;

class TaxCalculatorApp {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        double income1 = 9_000;
        double income2 = 11_000;
        double income3 = 48_000;

        System.out.println(taxCalculator.calculateTax(income1));
        System.out.println(taxCalculator.calculateTax(income2));
        System.out.println(taxCalculator.calculateTax(income3));
    }
}
