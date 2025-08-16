package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import java.math.BigDecimal;

class PremiumCalculator {

    private FireRiskCalculator fireRiskCalculator = new FireRiskCalculator();
    private FloodRiskCalculator floodRiskCalculator = new FloodRiskCalculator();
    private TheftRiskCalculator theftRiskCalculator = new TheftRiskCalculator();

    BigDecimal calculate(Policy policy) {
        return policy.getObjects().stream()
                .map(object -> fireRiskCalculator.calculatePremium(object)
                        .add(floodRiskCalculator.calculatePremium(object)
                        .add(theftRiskCalculator.calculatePremium(object))))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
