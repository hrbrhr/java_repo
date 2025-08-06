package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirePremiumCalculatorTest {
    @Test
    public void shouldCalculate1Object2SubObjects() {
        FirePremiumCalculator calculator = new FirePremiumCalculator(RiskType.FIRE);
        List<PolicySubObject> subObjects = List.of(
                new FireRiskSubObject("TV", 100.00),
                new TheftRiskSubObject("Vase", 8.00)
        );
        List<PolicyObject> policyObjects = List.of(
                new PolicyObject("House", subObjects)
        );
        Policy policy = new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, policyObjects);
        BigDecimal expected = BigDecimal.valueOf(100.00 * 0.014).setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected, calculator.calculatePremium(policy));
    }

    @Test
    public void shouldCalculate1Object2SubObjectsCase2() {
        FirePremiumCalculator calculator = new FirePremiumCalculator(RiskType.FIRE);
        List<PolicySubObject> subObjects = List.of(
                new FireRiskSubObject("TV", 500.00),
                new TheftRiskSubObject("Vase", 102.51)
        );
        List<PolicyObject> policyObjects = List.of(
                new PolicyObject("House", subObjects)
        );
        Policy policy = new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, policyObjects);
        BigDecimal expected = BigDecimal.valueOf(500 * 0.024).setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected, calculator.calculatePremium(policy));
    }

    @Test
    public void shouldCalculate2Objects2SubObjectsEach() {
        FirePremiumCalculator calculator = new FirePremiumCalculator(RiskType.FIRE);
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
        BigDecimal expected = BigDecimal.valueOf(600 * 0.024).setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected, calculator.calculatePremium(policy));
    }
}