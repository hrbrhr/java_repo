package org.javaguru.student_aleksey_volokitin.project_5_plus_apple_warehouse.v1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleWarehouseTest {

    @Test
    void test1_findGreenApples() {
        AppleWarehouse warehouse = new AppleWarehouse();

        List<Apple> testGreenApple = warehouse.findGreenApples();
        assertEquals(3, testGreenApple.size());
    }

    @Test
    void test2_findRedApples() {
        AppleWarehouse warehouse = new AppleWarehouse();

        List<Apple> testRedApple = warehouse.findRedApples();
        assertEquals(4, testRedApple.size());
    }

    @Test
    void test3_findApplesByColor() {
        AppleWarehouse warehouse = new AppleWarehouse();

        List<Apple> testGreenApple = warehouse.findApplesByColor("green");
        List<Apple> testRedApple = warehouse.findApplesByColor("red");
        List<Apple> testYellowApple = warehouse.findApplesByColor("yellow");

        assertEquals(3, testGreenApple.size());
        assertEquals(4, testRedApple.size());
        assertEquals(5, testYellowApple.size());

    }

    @Test
    void test4_findHeavyApples() {
        AppleWarehouse warehouse = new AppleWarehouse();

        List<Apple> test1AppleHeavierThen0 = warehouse.findApplesHeavierThen(0);
        List<Apple> test2AppleHeavierThen70 = warehouse.findApplesHeavierThen(70);
        List<Apple> test3AppleHeavierThen90 = warehouse.findApplesHeavierThen(90);
        List<Apple> test4AppleHeavierThen150 = warehouse.findApplesHeavierThen(150);
        List<Apple> test5AppleHeavierThen180 = warehouse.findApplesHeavierThen(180);

        assertEquals(12, test1AppleHeavierThen0.size());
        assertEquals(11, test2AppleHeavierThen70.size());
        assertEquals(8, test3AppleHeavierThen90.size());
        assertEquals(6, test4AppleHeavierThen150.size());
        assertEquals(3, test5AppleHeavierThen180.size());
    }

    @Test
    void test5_findApplesByCriteria() {
        AppleWarehouse warehouse = new AppleWarehouse();

        List<Apple> testGreenApple = warehouse.findApples(new GreenAppleSearchCriteria());
        List<Apple> testRedApple = warehouse.findApples(new RedAppleSearchCriteria());
        List<Apple> testHeavyApple = warehouse.findApples(new HeavyWeightAppleSearchCriteria());
        List<Apple> testLightApple = warehouse.findApples(new LigthWeightAppleSearchCriteria());

        assertEquals(3, testGreenApple.size());
        assertEquals(4, testRedApple.size());
        assertEquals(6, testHeavyApple.size());
        assertEquals(5, testLightApple.size());
    }

    @Test
    void test6_findHeavyGreenApples() {
        AppleWarehouse warehouse = new AppleWarehouse();

        List<Apple> testHeavyGreenApple = warehouse.findApples(new HeavyWeightAndGreenAppleSearchCriteria());

        assertEquals(1, testHeavyGreenApple.size());
    }

    @Test
    void test7_findApplesUsingAnonymousClass () {
        AppleWarehouse warehouse = new AppleWarehouse();

        List<Apple> testGreenApple = warehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) { return apple.getColor().equals("green"); }
        });
        assertEquals(3, testGreenApple.size());

        List<Apple> testRedApple = warehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) { return apple.getColor().equals("red"); }
        });
        assertEquals(4, testRedApple.size());

        List<Apple> testHeavyWeightApple = warehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) { return apple.getWeight() > 150; }
        });
        assertEquals(6, testHeavyWeightApple.size());

        List<Apple> testLightWeightApple = warehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) { return apple.getWeight() < 150; }
        });
        assertEquals(5, testLightWeightApple.size());
    }

    @Test
    void test8_findApplesUsingAnonymousClass () {
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