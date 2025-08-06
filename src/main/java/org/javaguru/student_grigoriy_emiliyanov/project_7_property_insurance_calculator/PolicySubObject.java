package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import java.math.BigDecimal;

abstract class PolicySubObject {
    private final String name;
    private final BigDecimal sumInsured;
    private final RiskType riskType;

    public PolicySubObject(String name, double sumInsured, RiskType riskType) {
        this.name = name;
        this.sumInsured = BigDecimal.valueOf(sumInsured);
        this.riskType = riskType;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    public RiskType getRiskType() {
        return riskType;
    }
}
