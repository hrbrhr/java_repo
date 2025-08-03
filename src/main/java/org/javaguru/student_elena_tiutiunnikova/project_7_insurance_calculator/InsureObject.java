package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import java.util.List;

class InsureObject {

    private String name;
    private List<InsureSubObject> subObjects;

    public InsureObject(String name, List<InsureSubObject> subObjects) {
        this.name = name;
        this.subObjects = subObjects;
    }

    public String getName() {
        return name;
    }

    public List<InsureSubObject> getSubObjects() {
        return subObjects;
    }
}
