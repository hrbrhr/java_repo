package org.javaguru.student_alexey_yakovlev.project_1_plus_tax_calculator;

class TaxCalculator {

    double calculateTax(double income) {

        if (income <= 10_000) {
            return (income * 30) / 100;
        } else if (income > 10_000  && income <= 50_000) {
            return ((10_000 * 30) / 100) + ((income - 10_000) * 40) / 100;
        } else {
            return ((10_000 * 30) / 100)
                    + ((50_000 - 10_000) * 40) / 100
                    + ((income - 50_000) * 50) / 100;
        }
    }
}
