package org.javaguru.student_grigoriy_emiliyanov.lesson_11_junit.homework;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {
    private final BigDecimal BIG_20K = new BigDecimal("20000");
    private final BigDecimal BIG_TAX_BELLOW_20K = new BigDecimal("0.25");
    private final BigDecimal BIG_TAX_ABOVE_20K = new BigDecimal("0.40");

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(BIG_20K) <= 0) {
            return income.multiply(BIG_TAX_BELLOW_20K);
        }
        BigDecimal taxFor20K = BIG_20K.multiply(BIG_TAX_BELLOW_20K);
        BigDecimal taxAbove20K = income.subtract(BIG_20K).multiply(BIG_TAX_ABOVE_20K);
        return taxFor20K.add(taxAbove20K);
    }
}
