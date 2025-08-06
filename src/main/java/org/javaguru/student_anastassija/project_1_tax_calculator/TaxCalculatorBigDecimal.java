package org.javaguru.student_anastassija.project_1_tax_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorBigDecimal{
    BigDecimal threshold = new BigDecimal("10000");
    BigDecimal upperLimit = new BigDecimal("50000");
    BigDecimal rate1 = new BigDecimal("0.3");
    BigDecimal rate2 = new BigDecimal("0.4");
    BigDecimal rate3 = new BigDecimal("0.5");

    BigDecimal calculateTaxBigDecimal(BigDecimal income) {
        if (isIncomeLessThan10k(income)) {
            return calculateTaxGradeWhenIncomeUnder10k(income);
        } else if (isIncomeMoreThan10kAndLessThan50k(income)){
            return calculateTaxGradeWhenIncomeMore10kAndUnder50k(income);
        } else {
            return calculateTaxGradeWhenIncomeMoreThan50k(income);
            //return 0.0;// пусть величина налога на данный момент будет 0, логику расчета реализуем в следующих заданиях
        }
    }
    private boolean isIncomeLessThan10k(BigDecimal testIncome) {
        return testIncome.compareTo(threshold) <= 0;
    }
    private boolean isIncomeMoreThan10kAndLessThan50k(BigDecimal incomeBetween) {
        return incomeBetween.compareTo(threshold) > 0 &&
                incomeBetween.compareTo(upperLimit) <= 0 ;
    }
    private BigDecimal calculateFirstPart(){
        return threshold.multiply(rate1);
    }
    private BigDecimal calculateSecondPart(BigDecimal income){
        return income.subtract(threshold).multiply(rate2);
    }
    private BigDecimal calculateTaxGradeWhenIncomeUnder10k(BigDecimal income) {
        return income.multiply(rate1)
                .setScale(2, RoundingMode.HALF_UP);
    }
    private BigDecimal calculateTaxGradeWhenIncomeMore10kAndUnder50k(BigDecimal income) {
        return calculateFirstPart().add(calculateSecondPart(income)).setScale(2, RoundingMode.HALF_UP);
    }
    private BigDecimal calculateTaxGradeWhenIncomeMoreThan50k(BigDecimal income) {
        BigDecimal part3 = income.subtract(upperLimit).multiply(rate3);  // (доход - 50 000) * 0.5
        return calculateFirstPart().add(calculateSecondPart(income)).add(part3).setScale(2, RoundingMode.HALF_UP);
    }
}