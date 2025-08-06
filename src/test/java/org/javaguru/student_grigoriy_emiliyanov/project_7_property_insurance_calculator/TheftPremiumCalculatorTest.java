package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheftPremiumCalculatorTest {
    @Test
    public void shouldCalculate1Object2SubObjects() {
        TheftPremiumCalculator calculator = new TheftPremiumCalculator(RiskType.THEFT);
        List<PolicySubObject> subObjects = List.of(
                new FireRiskSubObject("TV", 100.00),
                new TheftRiskSubObject("Vase", 8.00)
        );
        List<PolicyObject> policyObjects = List.of(
                new PolicyObject("House", subObjects)
        );
        Policy policy = new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, policyObjects);
        BigDecimal expected = BigDecimal.valueOf(8.00 * 0.11).setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected, calculator.calculatePremium(policy));
    }

    @Test
    public void shouldCalculate1Object2SubObjectsCase2() {
        TheftPremiumCalculator calculator = new TheftPremiumCalculator(RiskType.THEFT);
        List<PolicySubObject> subObjects = List.of(
                new FireRiskSubObject("TV", 500.00),
                new TheftRiskSubObject("Vase", 102.51)
        );
        List<PolicyObject> policyObjects = List.of(
                new PolicyObject("House", subObjects)
        );
        Policy policy = new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, policyObjects);
        BigDecimal expected = BigDecimal.valueOf(102.51 * 0.05).setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected, calculator.calculatePremium(policy));
    }

    @Test
    public void shouldCalculate2Objects2SubObjectsEach() {
        TheftPremiumCalculator calculator = new TheftPremiumCalculator(RiskType.THEFT);
        List<PolicySubObject> houseSubObjects = List.of(
                new FireRiskSubObject("TV", 500.00),
                new TheftRiskSubObject("Fridge", 102.51)
        );
        List<PolicySubObject> dachaSubObjects = List.of(
                new TheftRiskSubObject("Vase", 8.00),
                new FireRiskSubObject("TV", 100.00)
        );
        List<PolicyObject> policyObjects = List.of(
                new PolicyObject("House", houseSubObjects),
                new PolicyObject("Dacha", dachaSubObjects)
        );
        Policy policy = new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, policyObjects);
        BigDecimal expected = BigDecimal.valueOf(110.51 * 0.05).setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected, calculator.calculatePremium(policy));
    }

}