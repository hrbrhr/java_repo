package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Policy {
    private String number;
    private PolicyStatus status;
    private List<PolicyObject> policyObjects = new ArrayList<>();

    public Policy(String number, PolicyStatus status, List<PolicyObject> policyObjects) {
        this.number = number;
        this.status = status;
        this.policyObjects = policyObjects;
    }

    public String getNumber() {
        return number;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public List<PolicyObject> getPolicyObjects() {
        return policyObjects;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Policy policy)) return false;
        return Objects.equals(number, policy.number) && status == policy.status && Objects.equals(policyObjects, policy.policyObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, status, policyObjects);
    }
}
