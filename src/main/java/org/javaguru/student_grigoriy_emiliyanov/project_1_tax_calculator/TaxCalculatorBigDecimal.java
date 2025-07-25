package org.javaguru.student_grigoriy_emiliyanov.project_1_tax_calculator;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculatorBigDecimal {
    private final BigDecimal TAX_BELLOW_10K = new BigDecimal("0.3");
    private final BigDecimal TAX_10K_50K = new BigDecimal("0.4");
    private final BigDecimal TAX_ABOVE_50K = new BigDecimal("0.5");
    private final BigDecimal BIG_10K = new BigDecimal("10000");
    private final BigDecimal BIG_50K = new BigDecimal("50000");

    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal tax = new BigDecimal("0.0");
        if (isLowerThan10K(income)) {
            tax = getTaxBellow10k(income);
        } else if (isBetween10kAnd50k(income)) {
            tax = getTaxFrom10kTo50k(income);
        } else if (isBiggerThan50k(income)) {
            tax = getTaxOver50k(income);
        }
        return tax;
    }

    private boolean isLowerThan10K(BigDecimal income) {
        return income.compareTo(BIG_10K) <= 0;
    }

    private boolean isBetween10kAnd50k(BigDecimal income) {
        return income.compareTo(BIG_10K) > 0 &&
                income.compareTo(BIG_50K) <= 0;
    }

    private boolean isBiggerThan50k(BigDecimal income) {
        return income.compareTo(BIG_50K) > 0;
    }

    private BigDecimal getTaxBellow10k(BigDecimal income) {
        return income.multiply(TAX_BELLOW_10K).setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal getTaxFrom10kTo50k(BigDecimal income) {
        return getTaxBellow10k(BIG_10K)
                .add(income.subtract(BIG_10K).multiply(TAX_10K_50K));
    }

    private BigDecimal getTaxOver50k(BigDecimal income) {
        return getTaxFrom10kTo50k(BIG_50K)
                .add((income.subtract(BIG_50K).multiply(TAX_ABOVE_50K)));
    }
}
