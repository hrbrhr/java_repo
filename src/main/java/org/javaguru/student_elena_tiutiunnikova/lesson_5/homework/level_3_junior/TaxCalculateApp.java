package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_3_junior;

class TaxCalculateApp {
    public static void main(String[] args) {

        TaxCalculate taxCalculate = new TaxCalculate();
        double profit1 = 1000;
        System.out.println(taxCalculate.taxCalculate(profit1));

        TaxCalculate taxCalculate2 = new TaxCalculate();
        double profit2 = 45000;
        System.out.println(taxCalculate.taxCalculate(profit2));

        TaxCalculate taxCalculate3 = new TaxCalculate();
        double profit3 = 600000;
        System.out.println(taxCalculate.taxCalculate(profit3));
    }
}