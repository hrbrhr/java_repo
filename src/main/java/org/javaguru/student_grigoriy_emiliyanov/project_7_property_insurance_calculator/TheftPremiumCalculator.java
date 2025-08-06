package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import java.math.BigDecimal;

class TheftPremiumCalculator extends SingleRiskPremiumCalculator {
    private final BigDecimal THEFT_PREMIUM_LIMIT = BigDecimal.valueOf(15.00);
    private final BigDecimal COEFFICIENT_BELLOW_LIMIT = BigDecimal.valueOf(0.11);
    private final BigDecimal COEFFICIENT_ABOVE_LIMIT = BigDecimal.valueOf(0.05);

    public TheftPremiumCalculator(RiskType riskType) {
        super(riskType);
    }

    @Override
    protected BigDecimal calculateCoefficient(BigDecimal sum) {
        return isValueBellowLimit(sum) ? COEFFICIENT_BELLOW_LIMIT : COEFFICIENT_ABOVE_LIMIT;
    }

    private boolean isValueBellowLimit(BigDecimal value) {
        return value.compareTo(THEFT_PREMIUM_LIMIT) < 0;
    }
}
