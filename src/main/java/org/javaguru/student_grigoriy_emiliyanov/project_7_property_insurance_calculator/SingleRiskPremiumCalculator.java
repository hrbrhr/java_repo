package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

abstract class SingleRiskPremiumCalculator {
    private final RiskType riskType;

    public SingleRiskPremiumCalculator(RiskType riskType) {
        this.riskType = riskType;
    }

    public BigDecimal calculatePremium(Policy policy) {
        BigDecimal sumInsuredForThisRiskType = totalSumInsuredByRiskType(policy);
        BigDecimal coefficient = calculateCoefficient(sumInsuredForThisRiskType);
        return sumInsuredForThisRiskType.multiply(coefficient).setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal totalSumInsuredByRiskType(Policy policy) {
        return policy.getPolicyObjects().stream()
                .map(PolicyObject::getPolicySubObjects)
                .flatMap(List::stream)
                .filter(subObject -> subObject.getRiskType().equals(riskType))
                .map(PolicySubObject::getSumInsured)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    protected abstract BigDecimal calculateCoefficient(BigDecimal sum);
}
