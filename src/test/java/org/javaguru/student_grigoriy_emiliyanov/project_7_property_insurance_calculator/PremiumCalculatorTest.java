package org.javaguru.student_grigoriy_emiliyanov.project_7_property_insurance_calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PremiumCalculatorTest {
    @Test
    public void shouldCalculate1Object2SubObjects() {
        PremiumCalculator calculator = new PremiumCalculator();
        List<PolicySubObject> subObjects = List.of(
                new FireRiskSubObject("TV", 100.00),
                new TheftRiskSubObject("Vase", 8.00)
        );
        List<PolicyObject> policyObjects = List.of(
                new PolicyObject("House", subObjects)
        );
        Policy policy = new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, policyObjects);
        BigDecimal expected = BigDecimal.valueOf(2.28);
        assertEquals(expected, calculator.calculate(policy));
    }

    @Test
    public void shouldCalculate1Object2SubObjectsCase2() {
        PremiumCalculator calculator = new PremiumCalculator();
        List<PolicySubObject> subObjects = List.of(
                new FireRiskSubObject("TV", 500.00),
                new TheftRiskSubObject("Vase", 102.51)
        );
        List<PolicyObject> policyObjects = List.of(
                new PolicyObject("House", subObjects)
        );
        Policy policy = new Policy("LV20-02-100000-5", PolicyStatus.REGISTERED, policyObjects);
        BigDecimal expected = BigDecimal.valueOf(17.13);
        assertEquals(expected, calculator.calculate(policy));
    }

    @Test
    public void shouldCalculate2Objects2SubObjectsEach() {
        PremiumCalculator calculator = new PremiumCalculator();
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
        BigDecimal expected = BigDecimal.valueOf(19.93);
        assertEquals(expected, calculator.calculate(policy));
    }
}