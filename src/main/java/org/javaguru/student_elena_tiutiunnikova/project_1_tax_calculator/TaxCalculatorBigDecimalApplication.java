package org.javaguru.student_elena_tiutiunnikova.project_1_tax_calculator;

import java.math.BigDecimal;

class TaxCalculatorBigDecimalApplication {
    public static void main(String[] args) {

        TaxCalculatorBigDecimal calculator = new TaxCalculatorBigDecimal();

        BigDecimal tax1 = calculator.calculateTax(new BigDecimal("10000"));
        System.out.println("Tax: " + tax1);

        BigDecimal tax2 = calculator.calculateTax(new BigDecimal("50000"));
        System.out.println("Tax: " + tax2);

        BigDecimal tax3 = calculator.calculateTax(new BigDecimal("60000"));
        System.out.println("Tax: " + tax3);

        BigDecimal tax4 = calculator.calculateTax(new BigDecimal("-10"));
        System.out.println("Tax: " + tax4);
    }

}
