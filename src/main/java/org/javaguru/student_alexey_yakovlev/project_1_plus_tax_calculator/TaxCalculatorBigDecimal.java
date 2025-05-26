package org.javaguru.student_alexey_yakovlev.project_1_plus_tax_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorBigDecimal {

    BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal(10_000)) <= 0) {
            return calculateTaxWhenIncomeUnder10K(income);
        }
        if (income.compareTo(new BigDecimal(10_000)) > 0
                && income.compareTo(new BigDecimal(50_000)) <= 0) {
            return calculateTaxIncomeOver10AndLessThan50(income);
        }
        return calculateTaxIncomeOver50(income);
    }

    private boolean isIncomeLessThen10k(BigDecimal income) {
        return income.compareTo(new BigDecimal("10_000")) <= 0;
    }

    private BigDecimal calculateTaxWhenIncomeUnder10K(BigDecimal income) {
        return income.multiply(new BigDecimal(0.3))
                .setScale(2, RoundingMode.HALF_UP);
    }

    private boolean isIncomeFrom10kToLessThen50k(BigDecimal income) {
        return income.compareTo(new BigDecimal("10_000")) > 0
                && income.compareTo(new BigDecimal("50_000")) <= 0;
    }

    private BigDecimal calculateTaxIncomeOver10AndLessThan50(BigDecimal income) {
        BigDecimal tenk = new BigDecimal("10000");
        BigDecimal tax_rate_03 = new BigDecimal("0.3");
        BigDecimal tax_rate_04 = new BigDecimal("0.4");

        BigDecimal tax_1 = tenk.multiply(tax_rate_03);
        BigDecimal tax_2 = income.subtract(tenk).multiply(tax_rate_04);

        return tax_1.add(tax_2).setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateTaxIncomeOver50(BigDecimal income) {
        BigDecimal tenk = new BigDecimal("10000");
        BigDecimal fiftyk = new BigDecimal("50000");
        BigDecimal tax_rate_03 = new BigDecimal("0.3");
        BigDecimal tax_rate_04 = new BigDecimal("0.4");
        BigDecimal tax_rate_05 = new BigDecimal("0.5");

        BigDecimal tax_1 = tenk.multiply(tax_rate_03);
        BigDecimal tax_2 = fiftyk.subtract(tenk).multiply(tax_rate_04);
        BigDecimal tax_3 = income.subtract(fiftyk).multiply(tax_rate_05);

        return tax_1.add(tax_2).add(tax_3).setScale(2, RoundingMode.HALF_UP);
    }
}
