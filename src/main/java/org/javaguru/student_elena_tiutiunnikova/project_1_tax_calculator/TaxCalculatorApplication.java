package org.javaguru.student_elena_tiutiunnikova.project_1_tax_calculator;

class TaxCalculatorApplication {
    public static void main(String[] args) {

        TaxCalculator calculator = new TaxCalculator();

        double tax1 = calculator.calculateTaxTo10k(10000);
        System.out.println("Tax: " + tax1);

        double tax2 = calculator.calculateTaxFrom10kTo50k(50000);
        System.out.println("Tax: " + tax2);

        double tax3 = calculator.calculateTaxFrom50k(60000);
        System.out.println("Tax: " + tax3);
    }

}
