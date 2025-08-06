package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

class FireRiskSubObject extends PolicySubObject {
    public FireRiskSubObject(String name, double sumInsured) {
        super(name, sumInsured, RiskType.FIRE);
    }
}
