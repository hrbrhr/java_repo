package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import java.util.List;

class Policy {
    private String number;
    private List<InsureObject> objects;
    private PolicyStatus policyStatus;

    public Policy(String number, List<InsureObject> objects, PolicyStatus policyStatus) {
        this.number = number;
        this.objects = objects;
        this.policyStatus = policyStatus;
    }

    public String getNumber() {
        return number;
    }

    public List<InsureObject> getObjects() {
        return objects;
    }

    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }
}
