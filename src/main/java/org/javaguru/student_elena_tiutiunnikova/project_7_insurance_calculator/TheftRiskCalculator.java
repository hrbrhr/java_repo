package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import java.math.BigDecimal;

class TheftRiskCalculator {
    private static final BigDecimal THEFT_SUM_INSURED_THRESHOLD = new BigDecimal("15");
    private static final BigDecimal THEFT_DEFAULT_COEFFICIENT = new BigDecimal("0.11");
    private static final BigDecimal THEFT_COEFFICIENT = new BigDecimal("0.05");

    BigDecimal calculatePremium (InsureObject object) {
        calculateSumTheft(object);
        findCoefficientTheth(object);
        return calculateSumTheft(object).multiply(findCoefficientTheth(object));
    }

    private BigDecimal calculateSumTheft (InsureObject object) {
        BigDecimal sumTheft = object.getSubObjects().stream()
                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.THEFT))
                .map(InsureSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return sumTheft;
    }

    private BigDecimal findCoefficientTheth (InsureObject object) {
        BigDecimal limitSum = THEFT_SUM_INSURED_THRESHOLD;
        BigDecimal coefficentTheft = THEFT_DEFAULT_COEFFICIENT;
        if (calculateSumTheft(object).compareTo(limitSum) > 0) {
            coefficentTheft = THEFT_COEFFICIENT;
        }
        return coefficentTheft;
    }
}
