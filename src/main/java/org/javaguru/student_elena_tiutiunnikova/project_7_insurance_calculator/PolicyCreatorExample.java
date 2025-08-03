package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import java.math.BigDecimal;
import java.util.List;

class PolicyCreatorExample {

//    продемонстрируйте создание:

    public static void main(String[] args) {
        //- полиса с одним объектом страхования и одним под объектом страхования;
        InsureSubObject tv = new InsureSubObject(List.of(RiskType.FIRE), new BigDecimal("100"), "TV");
        InsureObject house = new InsureObject("House", List.of(tv));
        Policy policy = new Policy("LV20-02-100000-1", List.of(house), PolicyStatus.APPROVED);

        //- полиса с одним объектом страхования и двумя под объектами страхования;
        InsureSubObject tv2 = new InsureSubObject(List.of(RiskType.FIRE), new BigDecimal("100"), "TV");
        InsureSubObject kettle2 = new InsureSubObject(List.of(RiskType.FIRE), new BigDecimal("10"), "Kettle");
        InsureObject house2 = new InsureObject("House", List.of(tv, kettle2));
        Policy policy2 = new Policy("LV20-02-100000-2", List.of(house), PolicyStatus.APPROVED);

        //- полиса с двумя объектами страхования по одному под объекту страхования в каждом.
        InsureSubObject tv3 = new InsureSubObject(List.of(RiskType.FIRE), new BigDecimal("100"), "TV");
        InsureSubObject kettle3 = new InsureSubObject(List.of(RiskType.FIRE), new BigDecimal("10"), "Kettle");
        InsureObject house3 = new InsureObject("House", List.of(kettle3));
        InsureObject flat3 = new InsureObject("Flat", List.of(tv3));
        Policy policy3 = new Policy("LV20-02-100000-3", List.of(house), PolicyStatus.APPROVED);

    }

}
