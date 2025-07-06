package org.javaguru.student_vitalii_lutsenko.project_1.task_17;

import java.math.BigDecimal;

class TaxCalculatorBigDecimalApplication {
    public static void main(String[] args) {

        TaxCalculatorBigDecimal calculator = new TaxCalculatorBigDecimal();
        BigDecimal tax1 = calculator.calculateTax(new BigDecimal("4000"));
        BigDecimal tax2 = calculator.calculateTax(new BigDecimal("55000"));
        BigDecimal tax3 = calculator.calculateTax(new BigDecimal("100000"));

        System.out.println("Tax1: " + tax1);
        System.out.println("Tax2: " + tax2);
        System.out.println("Tax3: " + tax3);



    }


}
