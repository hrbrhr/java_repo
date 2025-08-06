package org.javaguru.student_anastassija.project_1_tax_calculator;

class TaxCalculatorApp{

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();

        double tax1 = taxCalculator.calculateTax(1000);
        System.out.println("Tax amount is " + tax1);

        double tax2 = taxCalculator.calculateTax(2000);
        System.out.println("Tax amount is " + tax2);

        double tax3 = taxCalculator.calculateTax(10000);
        System.out.println("Tax amount is " + tax3);

        double tax4 = taxCalculator.calculateTax(80000);
        System.out.println("Tax amount is " + tax4);

    }


       /* int number1 = 2000;
        int number2 = 10000;
        int number3 = 80000;

        int taxRate30 = taxCalculator.CalculateGrade(number1);
        int taxRate40 = taxCalculator.CalculateGrade(number2);
        int taxRate50 = taxCalculator.CalculateGrade(number3);

        System.out.println("Tax rate for " + number1 + " is " + taxRate30 + " % ");
        System.out.println("Tax rate for " + number2 + " is " + taxRate40 + " % ");
        System.out.println("Tax rate for " + number3 + " is " + taxRate50 + " % ");
    }*/
}
