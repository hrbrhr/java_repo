package org.javaguru.student_anastassija.project_1_tax_calculator;

class TaxCalculator{

    private double calculateTaxGradeWhenIncomeUnder10k(double income) {
        return income * 0.3;
    }
    private double calculateTaxGradeWhenIncomeMore10kAndUnder50k(double income) {
        return 10_000 * 0.3 + (income - 10_000) * 0.4;
    }
    private double calculateTaxGradeWhenIncomeMoreThan50k(double income) {
        return 10_000 * 0.3
                + (50_000 - 10_000) * 0.4
                + (income - 50_000) * 0.5;
    }
    double calculateTax(double income) {
        if (income > 0 && income <= 10000) {
            return income * 0.3;
        } else if (income > 10000 && income <= 50000){
            return 10_000 * 0.3 + (income - 10_000) * 0.4;
        } else {
            return 10_000 * 0.3
                    + (50_000 - 10_000) * 0.4
                    + (income - 50_000) * 0.5;
        }
        //return 0.0;// пусть величина налога на данный момент будет 0, логику расчета реализуем в следующих заданиях
    }

    /*int tax30 = 30;
    int tax40 = 40;
    int tax50 = 50;

    int CalculateGrade(int number){
        if (number > 0 && number <= 10000) {
            return tax30;
        } else if (number > 10000 && number <= 50000){
            return tax40;
        } else {
            return tax50;
        }
    }*/


}