package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import org.javaguru.mentor.project_7_property_insurance_calculator.task_22.insurance.InsuredObject;

import java.math.BigDecimal;

class FloodRiskCalculator {
    private static final BigDecimal FLOOD_SUM_INSURED_THRESHOLD = new BigDecimal("100");
    private static final BigDecimal FLOOD_DEFAULT_COEFFICIENT = new BigDecimal("0.014");
    private static final BigDecimal FLOOD_COEFFICIENT = new BigDecimal("0.024");

   BigDecimal calculatePremium(InsureObject object) {
       calculateSumFlood(object);
       findCoefficientFlood(object);
       return calculateSumFlood(object).multiply(findCoefficientFlood(object));
    }

    private BigDecimal calculateSumFlood (InsureObject object) {
        BigDecimal floodFire = object.getSubObjects().stream()
                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.FLOOD))
                .map(InsureSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return floodFire;
    }

    private BigDecimal findCoefficientFlood (InsureObject object) {
        BigDecimal limitSum = FLOOD_SUM_INSURED_THRESHOLD;
        BigDecimal coefficentFlood = FLOOD_DEFAULT_COEFFICIENT;
        if (calculateSumFlood(object).compareTo(limitSum) > 0) {
            coefficentFlood = FLOOD_COEFFICIENT;
        }
        return coefficentFlood;
    }

}
