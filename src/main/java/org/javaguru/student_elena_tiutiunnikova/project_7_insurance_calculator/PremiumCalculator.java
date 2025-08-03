package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import org.javaguru.mentor.project_7_property_insurance_calculator.task_17.insurance.InsuredObject;

import java.math.BigDecimal;
import java.util.List;

class PremiumCalculator {

    BigDecimal calculate(Policy policy) {
        return policy.getObjects().stream()
                .map(object -> calculateFire(object).add(calculateTheft(object)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculateFire (InsureObject object) {

        BigDecimal sumFire = object.getSubObjects().stream()
                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.FIRE))
                .map(InsureSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal limitSum = new BigDecimal("100");
        BigDecimal coefficentFire = new BigDecimal("0.014");
        if (sumFire.compareTo(limitSum) > 0) {
            coefficentFire = new BigDecimal("0.024");
        }
        return sumFire.multiply(coefficentFire);
    }

    private BigDecimal calculateTheft (InsureObject object) {

        BigDecimal sumTheft = object.getSubObjects().stream()
                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.THEFT))
                .map(InsureSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal limitSum = new BigDecimal("15");
        BigDecimal coefficentTheft = new BigDecimal("0.011");
        if (sumTheft.compareTo(limitSum) > 0) {
            coefficentTheft = new BigDecimal("0.005");
        }
        return sumTheft.multiply(coefficentTheft);
    }

//2. Вынести в отдельный метод расчёт SUM_INSURED_FIRE (строки 19 - 25);

//    private BigDecimal calculateSumFire (InsureObject object) {
//        BigDecimal sumFire = object.getSubObjects().stream()
//                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.FIRE))
//                .map(InsureSubObject::getSum)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//    }


//3. Вынести в отдельный метод расчёт SUM_INSURED_THEFT (строки 35 - 41);
//4. Вынести в отдельный метод нахождение COEFFICIENT_FIRE (строки 26 - 30);
//5. Вынести в отдельный метод нахождение COEFFICIENT_THEFT (строки 42 - 47);
//6. Вынести в отдельный метод нахождение премии для
//    одного объекта страхования (строки 11 - 13);
//7. Вынести в константы magic numbers (значения коэффициентов).


}
