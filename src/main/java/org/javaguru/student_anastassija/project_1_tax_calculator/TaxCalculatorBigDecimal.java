package org.javaguru.student_anastassija.project_1_tax_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorBigDecimal{
    BigDecimal LOWER_THRESHOLD = new BigDecimal("10000");
    BigDecimal UPPER_THRESHOLD = new BigDecimal("50000");
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
        return testIncome.compareTo(LOWER_THRESHOLD) <= 0;
    }
    private boolean isIncomeMoreThan10kAndLessThan50k(BigDecimal incomeBetween) {
        return incomeBetween.compareTo(LOWER_THRESHOLD) > 0 &&
                incomeBetween.compareTo(UPPER_THRESHOLD) <= 0 ;
    }
    private BigDecimal calculateFirstPart(){
        return LOWER_THRESHOLD.multiply(rate1);
    }
    private BigDecimal calculateSecondPart(BigDecimal income){

        BigDecimal aboveThresholdAmount = income.subtract(LOWER_THRESHOLD);// zp - 10000
        BigDecimal rangeMaxAmount = UPPER_THRESHOLD.subtract(LOWER_THRESHOLD);// 50000-10000
        BigDecimal amountInRange = aboveThresholdAmount.compareTo(rangeMaxAmount) < 0 ? aboveThresholdAmount : rangeMaxAmount;
        return amountInRange.multiply(rate2);  // Умножаем только реальную сумму в данном диапазоне
    }

    private BigDecimal calculateThirdPart(BigDecimal income){
        BigDecimal thirdPart = income.subtract(UPPER_THRESHOLD);
        return  thirdPart.multiply(rate3); // (доход - 50 000) * 0.5
    }

    private BigDecimal calculateTaxGradeWhenIncomeUnder10k(BigDecimal income) {
        return income.multiply(rate1)
                .setScale(2, RoundingMode.HALF_UP);
    }
    private BigDecimal calculateTaxGradeWhenIncomeMore10kAndUnder50k(BigDecimal income) {
        return calculateFirstPart().add(calculateSecondPart(income)).setScale(2, RoundingMode.HALF_UP);
    }
    private BigDecimal calculateTaxGradeWhenIncomeMoreThan50k(BigDecimal income) {
        return calculateFirstPart().add(calculateSecondPart(income)).add(calculateThirdPart(income)).setScale(2, RoundingMode.HALF_UP);
    }
}