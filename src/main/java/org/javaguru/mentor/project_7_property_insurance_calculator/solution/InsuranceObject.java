package org.javaguru.mentor.project_7_property_insurance_calculator.solution;

import java.util.List;

class InsuranceObject {

    private String name;
    private List<SubObject> subObjects;

    public InsuranceObject(String name,
                           List<SubObject> subObjects) {
        this.name = name;
        this.subObjects = subObjects;
    }

    public String getName() {
        return name;
    }

    public List<SubObject> getSubObjects() {
        return subObjects;
    }
}
