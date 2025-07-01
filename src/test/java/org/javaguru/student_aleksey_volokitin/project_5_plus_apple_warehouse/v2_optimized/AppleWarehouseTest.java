package org.javaguru.student_aleksey_volokitin.project_5_plus_apple_warehouse.v2_optimized;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleWarehouseTest {

    @Test
    void test_findApplesUsingLambda () {
        AppleWarehouse warehouse = new AppleWarehouse();

        List<Apple> testGreenApple = warehouse.findApples(
            (Apple apple) -> apple.getColor().equals("green"));
        assertEquals(3, testGreenApple.size());

        List<Apple> testRedApple = warehouse.findApples(
            (Apple apple) -> apple.getColor().equals("red"));
        assertEquals(4, testRedApple.size());

        List<Apple> testHeavyWeightApple = warehouse.findApples(
            (Apple apple) -> apple.getWeight() > 150);
        assertEquals(6, testHeavyWeightApple.size());

        List<Apple> testLightWeightApple = warehouse.findApples(
            (Apple apple) -> apple.getWeight() < 150);
        assertEquals(5, testLightWeightApple.size());
    }
}