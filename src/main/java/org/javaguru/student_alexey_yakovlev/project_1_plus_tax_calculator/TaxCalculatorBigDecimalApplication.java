package org.javaguru.student_alexey_yakovlev.project_1_plus_tax_calculator;

import java.math.BigDecimal;

class TaxCalculatorBigDecimalApplication {

    public static void main(String[] args) {
        TaxCalculatorBigDecimal taxCalculatorBigDecimal = new TaxCalculatorBigDecimal();

        BigDecimal tax1 = taxCalculatorBigDecimal.calculateTax(new BigDecimal(5_000));
        System.out.println(tax1);

        BigDecimal tax2 = taxCalculatorBigDecimal.calculateTax(new BigDecimal(20_000));
        System.out.println(tax2);

        BigDecimal tax3 = taxCalculatorBigDecimal.calculateTax(new BigDecimal(60_000));
        System.out.println(tax3);
    }
}

