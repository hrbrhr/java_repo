package org.javaguru.student_elena_tiutiunnikova.project_5_apple_warehouse;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {

    @Test
    void findGreenApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List <Apple> result = appleWarehouse.findGreenApples();
        assertEquals(3, result.size());
    }

    @Test
    void findRedApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> result = appleWarehouse.findRedApple();
        assertEquals(3, result.size());
    }

    @Test
    void findRedAplleByColour() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> result = appleWarehouse.findAppleByColour("red");
        assertEquals(3, result.size());
    }

    @Test
    void findHeavyApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> result = appleWarehouse.findHeavyApples(150);
        assertEquals(4, result.size());
    }

    @Test
    void findApplesBySearchCriteria() {
        AppleWarehouse appleWarehouse =  new AppleWarehouse();
        List<Apple> resultGreenApples = appleWarehouse.findApples(new GreenAppleSearchCriteria());
        assertEquals(3, resultGreenApples.size());

        List<Apple> resultRedApples = appleWarehouse.findApples(new RedAppleSearchCriteria());
        assertEquals(3, resultRedApples.size());

        List<Apple> resultHeavyApples = appleWarehouse.findApples(new HeavyAppleSearchCriteria());
        assertEquals(4, resultHeavyApples.size());

        List<Apple> resultLightApples = appleWarehouse.findApples(new LightAppleSearchCriteria());
        assertEquals(4, resultLightApples.size());
    }

    @Test
    void shouldFindApplesUsingAnonymousClass () {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> resultGreenApples =  appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColour().equals("green");
            }
        });
        assertEquals(3, resultGreenApples.size());

        List<Apple> resultRedApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColour().equals("red");
            }
        });
        assertEquals(3, resultRedApples.size());

        List<Apple> resultHeavyApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWheith() > 150;
            }
        });
        assertEquals(4, resultHeavyApples.size());

        List<Apple> resultLightApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWheith() < 150;
            }
        });
        assertEquals(4, resultLightApples.size());
    }

    @Test
    void shouldFindApplesUsingLambda () {
        AppleWarehouse appleWarehouse = new AppleWarehouse();

        List<Apple> resultGreenApples = appleWarehouse.findApples(apple -> apple.getColour().equals("green"));
        assertEquals(3, resultGreenApples.size());

        List<Apple> resultRedApples = appleWarehouse.findApples(apple -> apple.getColour().equals("red"));
        assertEquals(3, resultRedApples.size());

        List<Apple> resultHeavyApples = appleWarehouse.findApples(apple -> apple.getWheith() > 150);
        assertEquals(4, resultHeavyApples.size());

        List<Apple> resultLightApples = appleWarehouse.findApples(apple -> apple.getWheith() < 150);
        assertEquals(4, resultLightApples.size());

    }

}