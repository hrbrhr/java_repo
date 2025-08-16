package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import java.math.BigDecimal;

class FireRiskCalculator {
    private static final BigDecimal FIRE_SUM_INSURED_THRESHOLD = new BigDecimal("100");
    private static final BigDecimal FIRE_DEFAULT_COEFFICIENT = new BigDecimal("0.014");
    private static final BigDecimal FIRE_COEFFICIENT = new BigDecimal("0.024");

    BigDecimal calculatePremium(InsureObject object) {
        calculateSumFire(object);
        findCoefficientFire(object);
        return calculateSumFire(object).multiply(findCoefficientFire(object));
    }

    private BigDecimal calculateSumFire (InsureObject object) {
        BigDecimal sumFire = object.getSubObjects().stream()
                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.FIRE))
                .map(InsureSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return sumFire;
    }

    private BigDecimal findCoefficientFire (InsureObject object) {
        BigDecimal limitSum = FIRE_SUM_INSURED_THRESHOLD;
        BigDecimal coefficentFire = FIRE_DEFAULT_COEFFICIENT;
        if (calculateSumFire(object).compareTo(limitSum) > 0) {
            coefficentFire = FIRE_COEFFICIENT;
        }
        return coefficentFire;
    }
}
