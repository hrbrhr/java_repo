package org.javaguru.student_elena_tiutiunnikova.project_1_tax_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorBigDecimal {

    public BigDecimal calculateTax(BigDecimal salary) {
        BigDecimal tax = BigDecimal.ZERO;
        if (noSalary(salary)) {
            tax = BigDecimal.ZERO;
        } else if (isSalaryTo10k(salary)) {
            tax = calculateTaxTo10k(salary);
        } else if (isSalaryFrom10kTo50k(salary)) {
            tax = calculateTaxFrom10kTo50k(salary);
        } else if (isSalaryFrom50k(salary)) {
            tax = calculateTaxFrom50k(salary);
        } else {
            return tax;
        }
        return tax;
    }

    private boolean noSalary (BigDecimal salary) {
        return salary.compareTo(BigDecimal.ZERO) < 0;
    }

    private boolean isSalaryTo10k (BigDecimal salary) {
        return salary.compareTo(new BigDecimal("10000")) < 0;
    }

    private boolean isSalaryFrom10kTo50k (BigDecimal salary) {
        return (salary.compareTo(new BigDecimal("10000")) >= 0)
                && (salary.compareTo(new BigDecimal("50000")) < 0);
    }

    private boolean isSalaryFrom50k (BigDecimal salary) {
        return (salary.compareTo(new BigDecimal("50000")) >= 0);
    }

    private BigDecimal calculateTaxTo10k (BigDecimal salary) {
        return (salary.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP))
                .multiply(new BigDecimal("30")).setScale(2,RoundingMode.HALF_UP);
    }

    private BigDecimal calculateTaxFrom10kTo50k (BigDecimal salary) {
        return (new BigDecimal("3000").add((((salary.subtract(new BigDecimal("10000")))
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP))
                .multiply(new BigDecimal("40"))))).setScale(2,RoundingMode.HALF_UP);
    }

    private BigDecimal calculateTaxFrom50k (BigDecimal salary) {
        return (new BigDecimal("19000").add((((salary.subtract(new BigDecimal("50000")))
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP))
                .multiply(new BigDecimal("50"))))).setScale(2,RoundingMode.HALF_UP);
//                19000.0 + (((salary - 50000.0) / 100) * 50);
    }

}
