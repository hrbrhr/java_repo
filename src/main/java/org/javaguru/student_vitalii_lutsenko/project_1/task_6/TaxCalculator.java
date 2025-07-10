package org.javaguru.student_vitalii_lutsenko.project_1.task_6;

 class TaxCalculator {

    double calculateTax(double income) {

        if (income <= 10_000){
            return income * 0.3;
        }
        if (income > 10_000 && income <= 50_000) {
            return 10_000 * 0.3 + (income - 10_000) * 0.4;
        }


       return 0.0; // пусть величина налога на данный момент будет 0, логику расчета реализуем в следующих заданиях
    }

 }
