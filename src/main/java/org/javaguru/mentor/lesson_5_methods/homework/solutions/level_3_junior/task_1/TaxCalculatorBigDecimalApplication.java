package org.javaguru.mentor.lesson_5_methods.homework.solutions.level_3_junior.task_1;

import java.math.BigDecimal;

class TaxCalculatorBigDecimalApplication {

    public static void main(String[] args) {
        TaxCalculatorBigDecimal calculator = new TaxCalculatorBigDecimal();
        System.out.println("Income 9000, tax = " + calculator.calculateTax(new BigDecimal("9000")));
        System.out.println("Income 11000, tax = " + calculator.calculateTax(new BigDecimal("11000")));
        System.out.println("Income 48000, tax = " + calculator.calculateTax(new BigDecimal("48000")));
        System.out.println("Income 55000, tax = " + calculator.calculateTax(new BigDecimal("55000")));
    }

}
