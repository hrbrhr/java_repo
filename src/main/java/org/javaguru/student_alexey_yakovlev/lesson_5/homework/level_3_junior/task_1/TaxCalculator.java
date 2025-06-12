package org.javaguru.student_alexey_yakovlev.lesson_5.homework.level_3_junior.task_1;

class TaxCalculator {

    double calculateTax(double income) {
        if (income < 10_000) {
            return incomeLessThen10K(income);
        } else if (income >= 10_000 && income < 50_000) {
            return incomeMoreThan10AndLessThan50(income);
        } else {
            return incomeMoreThen50(income);
        }
    }

    private double incomeLessThen10K(double income) {
        return (income * 30) / 100;
    }

    private double incomeMoreThan10AndLessThan50(double income) {
        return ((10_000 * 30) / 100) + ((income - 10_000) * 40) / 100;
    }

    private double incomeMoreThen50(double income) {
        return ((10_000 * 30) / 100)
                + ((50_000 - 10_000) * 40) / 100
                + ((income - 50_000) * 50) / 100;
    }
}
