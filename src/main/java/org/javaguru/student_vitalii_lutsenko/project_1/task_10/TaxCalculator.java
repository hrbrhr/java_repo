package org.javaguru.student_vitalii_lutsenko.project_1.task_10;

 class TaxCalculator {
     
     private double calculateTaxWenIncomeUnder10k (double income){
         return income * 0.3;
     }
     private double calculateTaxWenIncomeFrom10kTo50k(double income){
         return 10_000 * 0.3 + (income - 10_000) * 0.4;
     }
     private double calculateTaxWenIncomeMore50k (double income){
         return 10_000 * 0.3 + (50_000 - 10_000) * 0.4 + (income - 50_000) * 0.5;
     }


    double calculateTax(double income) {

        if (income <= 10_000){
            return calculateTaxWenIncomeUnder10k(income);
        }
        if (income > 10_000 && income <= 50_000) {
            return calculateTaxWenIncomeFrom10kTo50k(income);
        }
        return  calculateTaxWenIncomeMore50k(income);

    }

 }
