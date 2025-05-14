package org.javaguru.student_aleksey_volokitin.project_1_plus_tax_calculator;

class TaxCalculator {
    double calculateTax(double income){
        if ((income > 0) && (income <= 10000)) {
            return calculateTaxWhenIncomeUnder10k(income);
        }
        else if ((income > 10000) && (income <= 50000)) {
            return calculateTaxWhenIncomeBetween10And50k(income);
        } else if (income > 50000) {
            return calculateTaxWhenIncomeOver50k(income);
        }
        else {
            return 0.0;
        }
    }

    private double calculateTaxWhenIncomeUnder10k(double income) {
        return income * 0.3d;
    }
    private double calculateTaxWhenIncomeBetween10And50k(double income) {
        double incomeOver10k = income - 10000;
        double tax1 = calculateTaxWhenIncomeUnder10k(10000);
        double tax2 = incomeOver10k * 0.4d;
        return tax1 + tax2;
    }
    private double calculateTaxWhenIncomeOver50k(double income) {
        double incomeOver50k = income - 50000;
        double tax1 = calculateTaxWhenIncomeBetween10And50k(50000);
        double tax2 = incomeOver50k * 0.5d;
        return tax1 + tax2;
    }
}
