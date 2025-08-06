package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

class TheftRiskSubObject extends PolicySubObject {
    public TheftRiskSubObject(String name, double sumInsured) {
        super(name, sumInsured, RiskType.THEFT);
    }
}
