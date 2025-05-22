package org.javaguru.student_alexey_yakovlev.project_1_plus_tax_calculator;

class TaxCalculatorApplication {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        double tax1 = taxCalculator.calculateTax(5_000);
        System.out.println(tax1);

        double tax2 = taxCalculator.calculateTax(20_000);
        System.out.println(tax2);

        double tax3 = taxCalculator.calculateTax(60_000);
        System.out.println(tax3);
    }
}
