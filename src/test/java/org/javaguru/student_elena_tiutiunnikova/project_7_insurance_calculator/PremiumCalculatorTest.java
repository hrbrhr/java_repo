package org.javaguru.student_elena_tiutiunnikova.project_7_insurance_calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PremiumCalculatorTest {

    @Test
    public void Object_1_Sub_1_Fire_SumInsured_Under100() {
        InsureSubObject tv = createSubObject("TV", "100.00", RiskType.FIRE);
        InsureObject house = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV20-02-100000-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("1.4").stripTrailingZeros(),
                     premium.stripTrailingZeros());
    }

    @Test
    public void Object_1_Sub_1_Fire_SumInsured_More100() {
        InsureSubObject tv;
        tv = createSubObject("TV", "500.00", RiskType.FIRE);
        InsureObject house = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV20-02-100000-2", PolicyStatus.REGISTERED, house);
        BigDecimal premium = premiumCalculator.calculate(policy);
        //assertEquals(new BigDecimal("12.0").stripTrailingZeros(),
        //             premium.stripTrailingZeros());
    }

    @Test
    public void Object_1_Sub_1_Theft_SumInsured_Under15() {
        InsureSubObject tv = createSubObject("TV", "8.00", RiskType.THEFT);
        InsureObject house = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV20-02-100000-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = premiumCalculator.calculate(policy);
        //assertEquals(new BigDecimal("0.88").stripTrailingZeros(),
        //             premium.stripTrailingZeros());
    }

    @Test
    public void Object_1_Sub_1_Theft_SumInsured_More15() {
        InsureSubObject tv = createSubObject("TV", "102.51", RiskType.THEFT);
        InsureObject house = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV20-02-100000-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = premiumCalculator.calculate(policy);
        //assertEquals(new BigDecimal("5.1255").stripTrailingZeros(),
        //             premium.stripTrailingZeros());
    }

    @Test
    public void Object_1_Sub_2_Fire_SumInsured_Under100() {
        InsureSubObject tv = createSubObject("TV", "90.00", RiskType.FIRE);
        InsureSubObject kettle = createSubObject("Kettle", "10.00", RiskType.FIRE);
        InsureObject house = createInsuredObject("House 1", tv, kettle);
        Policy policy = createPolicy("LV20-02-100000-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = premiumCalculator.calculate(policy);
        //assertEquals(new BigDecimal("1.4").stripTrailingZeros(),
        //             premium.stripTrailingZeros());
    }

    @Test
    public void Object_1_Sub_2_Fire_SumInsured_More100() {
        InsureSubObject tv;
        tv = createSubObject("TV", "500.00", RiskType.FIRE);
        InsureSubObject kettle = createSubObject("Kettle", "10.00", RiskType.FIRE);
        InsureObject house = createInsuredObject("House 1", tv, kettle);
        Policy policy = createPolicy("LV20-02-100000-2", PolicyStatus.REGISTERED, house);
        BigDecimal premium = premiumCalculator.calculate(policy);
        //assertEquals(new BigDecimal("12.24).stripTrailingZeros(),
        //             premium.stripTrailingZeros());
    }

    @Test
    public void Object_1_Sub_2_Theft_SumInsured_Under15() {
        InsureSubObject tv = createSubObject("TV", "8.00", RiskType.THEFT);
        InsureSubObject kettle = createSubObject("Kettle", "4.00", RiskType.THEFT);
        InsureObject house = createInsuredObject("House 1", tv, kettle);
        Policy policy = createPolicy("LV20-02-100000-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = premiumCalculator.calculate(policy);
        //assertEquals(new BigDecimal("1.32").stripTrailingZeros(),
        //             premium.stripTrailingZeros());
    }

    @Test
    public void Object_1_Sub_2_Theft_SumInsured_More15() {
        InsureSubObject tv = createSubObject("TV", "102.51", RiskType.THEFT);
        InsureSubObject kettle = createSubObject("Kettle", "4.00", RiskType.THEFT);
        InsureObject house = createInsuredObject("House 1", tv, kettle);
        Policy policy = createPolicy("LV20-02-100000-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = premiumCalculator.calculate(policy);
        //assertEquals(new BigDecimal("5.3255").stripTrailingZeros(),
        //             premium.stripTrailingZeros());
    }

    @Test
    public void Object_2_Sub_2_Theft_And_Fire_SumInsured() {
        InsureSubObject tv = createSubObject("TV", "102.51", RiskType.THEFT);
        InsureSubObject kettle = createSubObject("Kettle", "4.00", RiskType.FIRE);
        InsureObject house = createInsuredObject("House 1", tv);
        InsureObject flat = createInsuredObject("Flat 1", kettle);
        Policy policy = createPolicy("LV20-02-100000-1", PolicyStatus.REGISTERED, house, flat);
        BigDecimal premium = premiumCalculator.calculate(policy);
        //assertEquals(new BigDecimal("5.1815").stripTrailingZeros(),
        //             premium.stripTrailingZeros());
    }


    private PremiumCalculator premiumCalculator = new PremiumCalculator();

    private static Policy createPolicy(String number, PolicyStatus status, InsureObject... objects) {
        return new Policy(number, Arrays.stream(objects).toList(), status);
    }

    private static InsureObject createInsuredObject(String name, InsureSubObject... subObjects) {
        return new InsureObject(name, Arrays.stream(subObjects).toList());
    }

    private static InsureSubObject createSubObject(String name, String sumInsured, RiskType... riskTypes) {
        return new InsureSubObject(Arrays.stream(riskTypes).toList(), new BigDecimal(sumInsured), name);
    }
    
}