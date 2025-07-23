package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.homework.level_3_junior;

class TaxCalculator {
    public double calculateTax(double income) {
        if (income < 10000) return income * 0.30;
        if (income > 10000 && income < 50000) return income * 0.40;
        return income * 0.50;
    }
}
