package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import java.util.ArrayList;
import java.util.List;

class PolicyObject {
    private String name;
    private List<PolicySubObject> policySubObjects = new ArrayList<>();

    public PolicyObject(String name, List<PolicySubObject> policySubObjects) {
        this.name = name;
        this.policySubObjects = policySubObjects;
    }

    public String getName() {
        return name;
    }

    public List<PolicySubObject> getPolicySubObjects() {
        return policySubObjects;
    }
}
