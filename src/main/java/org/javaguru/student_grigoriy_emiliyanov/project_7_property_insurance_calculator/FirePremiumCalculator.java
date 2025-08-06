package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import java.math.BigDecimal;

class FirePremiumCalculator extends SingleRiskPremiumCalculator {
    private final BigDecimal FIRE_PREMIUM_LIMIT = BigDecimal.valueOf(100.00);
    private final BigDecimal COEFFICIENT_BELLOW_LIMIT = BigDecimal.valueOf(0.014);
    private final BigDecimal COEFFICIENT_ABOVE_LIMIT = BigDecimal.valueOf(0.024);

    public FirePremiumCalculator(RiskType riskType) {
        super(riskType);
    }

    @Override
    protected BigDecimal calculateCoefficient(BigDecimal sum) {
        return isValueBellowOrEqualToLimit(sum) ? COEFFICIENT_BELLOW_LIMIT : COEFFICIENT_ABOVE_LIMIT;
    }

    private boolean isValueBellowOrEqualToLimit(BigDecimal value) {
        return value.compareTo(FIRE_PREMIUM_LIMIT) <= 0;
    }
}
