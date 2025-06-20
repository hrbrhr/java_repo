package org.javaguru.mentor.project_7_property_insurance_calculator.solution;

import java.util.List;

class Policy {

    private String policyNumber;
    private PolicyStatus status;
    private List<InsuranceObject> insuranceObjects;

    public Policy(String policyNumber,
                  PolicyStatus status,
                  List<InsuranceObject> insuranceObjects) {
        this.policyNumber = policyNumber;
        this.status = status;
        this.insuranceObjects = insuranceObjects;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public List<InsuranceObject> getInsuranceObjects() {
        return insuranceObjects;
    }
}
