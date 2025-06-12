package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_3;

 class CalculationOfTaxAmount {

     double calculateTax (double income){

        if (income <= 10000){
            return income * 0.30;
        } else if (income <= 50000) {
            double tax10k = 10000 * 0.30;
            double tax10kPlus = (income - 10000) * 0.40;
            return tax10k + tax10kPlus;
        } else  {
            double tax10k = 10000 * 0.30;
            double tax50k = 40000 * 0.40;
            double tax50kPlus  = (income-50000) * 0.50;
            return tax10k + tax50k + tax50kPlus;
        }





    }
}
