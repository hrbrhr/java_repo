package org.javaguru.student_alexey_yakovlev.project_1_plus_tax_calculator;

class TaxCalculator {

    double calculateTax(double income) {

        if (income <= 10_000) {
            return calculateTaxWhenIncomeUnder10K(income);
        }
        if (income > 10_000  && income <= 50_000) {
            return ((10_000 * 30) / 100) + ((income - 10_000) * 40) / 100;
        }
        return ((10_000 * 30) / 100)
                    + ((50_000 - 10_000) * 40) / 100
                    + ((income - 50_000) * 50) / 100;
        }

    double calculateTaxWhenIncomeUnder10K(double income) {
        return (income * 30) / 100;
    }
}
