package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import java.math.BigDecimal;
import java.util.List;

class InsureSubObject {

    private String name;
    private BigDecimal sum;
    private List<RiskType> risks;

    public InsureSubObject(List<RiskType> risks, BigDecimal sum, String name) {
        this.risks = risks;
        this.sum = sum;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public List<RiskType> getRisks() {
        return risks;
    }

}
