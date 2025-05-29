package org.javaguru.student_elena_tiutiunnikova.project_1_tax_calculator;

 class TaxCalculator {
     double calculateTax (double income) {
        if ( income <= 10000 && income >= 0) {
            return taxForIncomeLess10k(income);
        } else if ( income <= 50000 && income > 10000) {
            return taxForIncomeMore10kLess50k(income);
        } else if ( income > 50000) {
            return taxForIncomeMore50k(income);
        } return 0.0;
     }

     private double taxForIncomeLess10k (double income) {
        return income * 0.3 ;
     }

     private double taxForIncomeMore10kLess50k (double income) {
         return income * 0.4 ;
     }

     private double taxForIncomeMore50k (double income) {
         return income * 0.5 ;
     }

}
