package org.javaguru.student_anastassija.project_1_tax_calculator;

import java.math.BigDecimal;

class TaxCalculateBigDecimalTests{

    public static void main(String[] args) {

        TaxCalculateBigDecimalTests test = new TaxCalculateBigDecimalTests();
        test.testTaxCalculator(new BigDecimal("9500"), new BigDecimal("2850"));
        test.testTaxCalculator(new BigDecimal("10000"), new BigDecimal("3000"));
        test.testTaxCalculator(new BigDecimal("12000"), new BigDecimal("3800"));
        test.testTaxCalculator(new BigDecimal("50000"), new BigDecimal("19000"));
        test.testTaxCalculator(new BigDecimal("88000"), new BigDecimal("38000"));

    }

    public void testTaxCalculator(BigDecimal salary, BigDecimal expectedResult){

        // vhodjashie dannye

        // vyzyvaem metod tax calculation, ispolzuja vhodjashie dannye

        TaxCalculatorBigDecimal calculator = new TaxCalculatorBigDecimal();
        BigDecimal calculatedTax = calculator.calculateTaxBigDecimal(salary);

        // sootvetstvie rezultata ozhidaniju
        //sravnivaju resultaty

        if(expectedResult.compareTo(calculatedTax) == 0) {
            System.out.println("OK");
        }
        else {
            System.out.println("NOK");
        }

        //vyvesti rezultat na konsol
        System.out.println("Salary is: " + salary );
        System.out.println("Calculated tax is: " + calculatedTax );
        System.out.println("Expected tax is: " + expectedResult );


    }
}