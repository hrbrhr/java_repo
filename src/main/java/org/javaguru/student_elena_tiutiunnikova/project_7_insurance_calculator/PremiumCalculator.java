package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import java.math.BigDecimal;
import java.util.List;

class PremiumCalculator {

//7. Вынести в константы magic numbers (значения коэффициентов).
    private static final BigDecimal FIRE_SUM_INSURED_THRESHOLD = new BigDecimal("100");
    private static final BigDecimal THEFT_SUM_INSURED_THRESHOLD = new BigDecimal("15");
    private static final BigDecimal FIRE_DEFAULT_COEFFICIENT = new BigDecimal("0.014");
    private static final BigDecimal FIRE_COEFFICIENT = new BigDecimal("0.024");
    private static final BigDecimal THEFT_DEFAULT_COEFFICIENT = new BigDecimal("0.11");
    private static final BigDecimal THEFT_COEFFICIENT = new BigDecimal("0.05");
    private static final BigDecimal FLOOD_SUM_INSURED_THRESHOLD = new BigDecimal("50");
    private static final BigDecimal FLOOD_DEFAULT_COEFFICIENT = new BigDecimal("0.10");
    private static final BigDecimal FLOOD_COEFFICIENT = new BigDecimal("0.15");


//6. Вынести в отдельный метод нахождение премии для
//    одного объекта страхования (строки 11 - 13);

    BigDecimal calculate(Policy policy) {
        return policy.getObjects().stream()
                .map(object -> calculateFire(object).add(calculateTheft(object).add(calculateFlood(object))))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculateFire (InsureObject object) {
        calculateSumFire(object);
        findCoefficientFire(object);
        return calculateSumFire(object).multiply(findCoefficientFire(object));
    }

    private BigDecimal calculateTheft (InsureObject object) {
        calculateSumTheft(object);
        findCoefficientTheth(object);
        return calculateSumTheft(object).multiply(findCoefficientTheth(object));
    }

    private BigDecimal calculateFlood (InsureObject object) {
        calculateSumFlood(object);
        findCoefficientFlood(object);
        return calculateSumFlood(object).multiply(findCoefficientFlood(object));
    }

//2. Вынести в отдельный метод расчёт SUM_INSURED_FIRE (строки 19 - 25);

    private BigDecimal calculateSumFire (InsureObject object) {
        BigDecimal sumFire = object.getSubObjects().stream()
                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.FIRE))
                .map(InsureSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return sumFire;
    }

//3. Вынести в отдельный метод расчёт SUM_INSURED_THEFT (строки 35 - 41);

    private BigDecimal calculateSumTheft (InsureObject object) {
        BigDecimal sumTheft = object.getSubObjects().stream()
                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.THEFT))
                .map(InsureSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return sumTheft;
    }

//4. Вынести в отдельный метод нахождение COEFFICIENT_FIRE (строки 26 - 30);

    private BigDecimal findCoefficientFire (InsureObject object) {
        BigDecimal limitSum = FIRE_SUM_INSURED_THRESHOLD;
        BigDecimal coefficentFire = FIRE_DEFAULT_COEFFICIENT;
        if (calculateSumTheft(object).compareTo(limitSum) > 0) {
            coefficentFire = FIRE_COEFFICIENT;
        }
        return coefficentFire;
    }

//5. Вынести в отдельный метод нахождение COEFFICIENT_THEFT (строки 42 - 47);

    private BigDecimal findCoefficientTheth (InsureObject object) {
        BigDecimal limitSum = THEFT_SUM_INSURED_THRESHOLD;
        BigDecimal coefficentTheft = THEFT_DEFAULT_COEFFICIENT;
        if (calculateSumTheft(object).compareTo(limitSum) > 0) {
            coefficentTheft = THEFT_COEFFICIENT;
        }
        return coefficentTheft;
    }

    private BigDecimal calculateSumFlood (InsureObject object) {
        BigDecimal floodFire = object.getSubObjects().stream()
                .filter(insureSubObject -> insureSubObject.getRisks().contains(RiskType.FLOOD))
                .map(InsureSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return floodFire;
    }

    private BigDecimal findCoefficientFlood (InsureObject object) {
        BigDecimal limitSum = FLOOD_SUM_INSURED_THRESHOLD;
        BigDecimal coefficentFlood = FLOOD_DEFAULT_COEFFICIENT;
        if (calculateSumTheft(object).compareTo(limitSum) > 0) {
            coefficentFlood = FLOOD_COEFFICIENT;
        }
        return coefficentFlood;
    }

}
