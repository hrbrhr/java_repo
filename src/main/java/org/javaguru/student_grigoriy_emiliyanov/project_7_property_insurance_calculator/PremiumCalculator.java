package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

class PremiumCalculator {
    Set<SingleRiskPremiumCalculator> riskPremiumCalculators = Set.of(
            new FirePremiumCalculator(RiskType.FIRE),
            new TheftPremiumCalculator(RiskType.THEFT)
    );

    public void addSingleRiskPremiumCalculator(SingleRiskPremiumCalculator singleRiskPremiumCalculator) {
        riskPremiumCalculators.add(singleRiskPremiumCalculator);
    }

    public BigDecimal calculate(Policy policy) {
        return riskPremiumCalculators.stream()
                .map(calculator -> calculator.calculatePremium(policy))
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }
}
