package org.javaguru.student_aleksey_volokitin.project_1_plus_tax_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorBigDecimal {
    private final BigDecimal value0k = new BigDecimal("0.0");
    private final BigDecimal value10k = new BigDecimal("10000");
    private final BigDecimal value50k = new BigDecimal("50000");
    private final BigDecimal percent30 = new BigDecimal("0.30");
    private final BigDecimal percent40 = new BigDecimal("0.40");
    private final BigDecimal percent50 = new BigDecimal("0.50");

    // Вычисление размера налога
    BigDecimal calculateTax (BigDecimal income) {

        if (isIncomeUnder10k(income)) {
            return calculateTaxWhenIncomeUnder10k(income);
        }
        else if (isIncomeBetween10And50k(income)) {
            return calculateTaxWhenIncomeBetween10And50k(income);
        }
        else if (isIncomeOver50k(income)) {
            return calculateTaxWhenIncomeOver50k(income);
        }
        else {
            return value0k;
        }
    }
    // Методы преобразования условий в легкоочитаемые
    private boolean isIncomeUnder10k(BigDecimal income) {
        return  (income.compareTo(value0k) > 0) && (income.compareTo(value10k) <= 0);
    }
    private boolean isIncomeBetween10And50k(BigDecimal income) {
        return (income.compareTo(value10k) > 0) && (income.compareTo(value50k) <= 0);
    }
    private boolean isIncomeOver50k(BigDecimal income) {
        return income.compareTo(value50k) > 0;
    }

    // Методы вычисления размера налога
    private BigDecimal calculateTaxWhenIncomeUnder10k(BigDecimal income) {
        BigDecimal tax = income.multiply(percent30);
        return tax.setScale(2, RoundingMode.HALF_UP);
    }
    private BigDecimal calculateTaxWhenIncomeBetween10And50k(BigDecimal income) {
        BigDecimal incomeOver10k = income.subtract(value10k);
        BigDecimal tax1 = calculateTaxWhenIncomeUnder10k(value10k);
        BigDecimal tax2 = incomeOver10k.multiply(percent40);
        return tax1.add(tax2).setScale(2, RoundingMode.HALF_UP);
    }
    private BigDecimal calculateTaxWhenIncomeOver50k(BigDecimal income) {
        BigDecimal incomeOver50k = income.subtract(value50k);
        BigDecimal tax1 = calculateTaxWhenIncomeBetween10And50k(value50k);
        BigDecimal tax2 = incomeOver50k.multiply(percent50);
        return tax1.add(tax2).setScale(2, RoundingMode.HALF_UP);
    }
}
