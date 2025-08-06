package org.javaguru.student_anastassija.project_1_tax_calculator;

import java.math.BigDecimal;

class TaxCalculatorBigDecimalApp {

    public static void main(String[] args) {

        TaxCalculatorBigDecimal calc  = new TaxCalculatorBigDecimal();

        BigDecimal tax1 = calc.calculateTaxBigDecimal(new BigDecimal("500"));
        System.out.println("Tax amount is " + tax1);

        BigDecimal tax2 = calc.calculateTaxBigDecimal(new BigDecimal("22000"));
        System.out.println("Tax amount is " + tax2);

        BigDecimal tax3 = calc.calculateTaxBigDecimal(new BigDecimal("33000"));
        System.out.println("Tax amount is " + tax3);

        BigDecimal tax4 = calc.calculateTaxBigDecimal(new BigDecimal("88000"));
        System.out.println("Tax amount is " + tax4);

    }


}
