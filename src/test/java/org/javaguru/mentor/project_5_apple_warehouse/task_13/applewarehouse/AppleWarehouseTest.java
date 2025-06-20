package org.javaguru.mentor.project_5_apple_warehouse.task_13.applewarehouse;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleWarehouseTest {

    private AppleWarehouse warehouse = new AppleWarehouse();

    @Test
    public void shouldFindGreenApples() {
        List<Apple> greenApples = warehouse.findGreenApples();
        assertEquals(greenApples.size(), 3);
    }

    @Test
    public void shouldFindRedApples() {
        List<Apple> greenApples = warehouse.findRedApples();
        assertEquals(greenApples.size(), 3);
    }

    @Test
    public void shouldFindApplesByColor() {
        List<Apple> greenApples = warehouse.findApplesByColor("green");
        assertEquals(greenApples.size(), 3);
        List<Apple> redApples = warehouse.findApplesByColor("red");
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void shouldFindApplesHeavierThen() {
        List<Apple> applesHeavierThen150 = warehouse.findApplesHeavierThen(150);
        assertEquals(applesHeavierThen150.size(), 4);
    }

    @Test
    public void shouldFindApplesUsingSearchCriteria() {
        List<Apple> greenApples = warehouse.findApples(new GreenAppleSearchCriteria());
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = warehouse.findApples(new RedAppleSearchCriteria());
        assertEquals(redApples.size(), 3);

        List<Apple> applesHeavierThen150 = warehouse.findApples(new HeavyAppleSearchCriteria());
        assertEquals(applesHeavierThen150.size(), 4);

        List<Apple> applesLightThen150 = warehouse.findApples(new LightAppleSearchCriteria());
        assertEquals(applesLightThen150.size(), 4);
    }

    @Test
    public void shouldFindApplesUsingAnonymousClass() {
        List<Apple> greenApples = warehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = warehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertEquals(redApples.size(), 3);

        List<Apple> applesHeavierThen150 = warehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(applesHeavierThen150.size(), 4);

        List<Apple> applesLightThen150 = warehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(applesLightThen150.size(), 4);
    }

    @Test
    public void shouldFindApplesUsingLambdaExpression() {
        List<Apple> greenApples = warehouse.findApples(apple -> "green".equals(apple.getColor()));
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = warehouse.findApples(apple -> "red".equals(apple.getColor()));
        assertEquals(redApples.size(), 3);

        List<Apple> applesHeavierThen150 = warehouse.findApples(apple -> apple.getWeight() > 150);
        assertEquals(applesHeavierThen150.size(), 4);

        List<Apple> applesLightThen150 = warehouse.findApples(apple -> apple.getWeight() < 150);
        assertEquals(applesLightThen150.size(), 4);
    }

}