package org.javaguru.mentor.project_4_apple_warehouse.step_1.applewarehouse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//class AppleWarehouseTest {
//
//    @Test
//    public void shouldFindGreenApples() {
//        //AppleWarehouse appleWarehouse = new AppleWarehouse();
//        var appleWarehouse = new AppleWarehouse();
//        var greenApples = appleWarehouse.findGreenApples();
//        assertEquals(greenApples.size(), 3);
//        for (Apple apple : greenApples) {
//            assertEquals(apple.getColor(), "green");
//        }
//    }
//
//    @Test
//    public void shouldFindRedApples() {
//        var appleWarehouse = new AppleWarehouse();
//        var redApples = appleWarehouse.findRedApples();
//        assertEquals(redApples.size(), 3);
//        for (Apple apple : redApples) {
//            assertEquals(apple.getColor(), "red");
//        }
//    }
//
//    @Test
//    public void shouldFindApplesByColor() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findApplesByColor("yellow");
//        assertEquals(apples.size(), 2);
//        for (Apple apple : apples) {
//            assertEquals(apple.getColor(), "yellow");
//        }
//    }
//
//    @Test
//    public void shouldFindLightweightApples() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findLightweightApples(150);
//        assertEquals(apples.size(), 4);
//        for (Apple apple : apples) {
//            assertTrue(apple.getWeight() < 150);
//        }
//    }
//
//    @Test
//    public void shouldFindHeavyApples() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findHeavyApples(150);
//        assertEquals(apples.size(), 4);
//        for (Apple apple : apples) {
//            assertTrue(apple.getWeight() >= 150);
//        }
//    }
//
//    @Test
//    public void shouldFindGreenApplesBySearchCriteria() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findApples(new GreenAppleSearchCriteria());
//        assertEquals(apples.size(), 3);
//        for (Apple apple : apples) {
//            assertEquals(apple.getColor(), "green");
//        }
//    }
//
//    @Test
//    public void shouldFindRedApplesBySearchCriteria() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findApples(new RedAppleSearchCriteria());
//        assertEquals(apples.size(), 3);
//        for (Apple apple : apples) {
//            assertEquals(apple.getColor(), "red");
//        }
//    }
//
//    @Test
//    public void shouldFindYellowApplesBySearchCriteria() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findApples(new FindAppleByColorSearchCriteria("yellow"));
//        assertEquals(apples.size(), 2);
//        for (Apple apple : apples) {
//            assertEquals(apple.getColor(), "yellow");
//        }
//    }
//
//    @Test
//    public void shouldFindHeavyGreenApplesBySearchCriteria() {
//        var appleWarehouse = new AppleWarehouse();
//
//        var searchCriteria = new AndSearchCriteria(
//                new GreenAppleSearchCriteria(),
//                new HeavyAppleSearchCriteria(150)
//        );
//
//        var apples = appleWarehouse.findApples(searchCriteria);
//        assertEquals(apples.size(), 1);
//        for (Apple apple : apples) {
//            assertEquals(apple.getColor(), "green");
//        }
//    }
//
//    @Test
//    public void shouldFindLightweightOrRedApplesBySearchCriteria() {
//        var appleWarehouse = new AppleWarehouse();
//
//        var searchCriteria = new OrSearchCriteria(
//                new RedAppleSearchCriteria(),
//                new LigthweightAppleSearchCriteria(150)
//        );
//
//        var apples = appleWarehouse.findApples(searchCriteria);
//        assertEquals(apples.size(), 6);
//    }
//
//    @Test
//    public void shouldFindGreenApplesByAnonimClass() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findApples(new AppleSearchCriteria() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals("green");
//            }
//        });
//        assertEquals(apples.size(), 3);
//        for (Apple apple : apples) {
//            assertEquals(apple.getColor(), "green");
//        }
//    }
//
//    @Test
//    public void shouldFindRedApplesByAnonimClass() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findApples(new AppleSearchCriteria() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals("red");
//            }
//        });
//        assertEquals(apples.size(), 3);
//        for (Apple apple : apples) {
//            assertEquals(apple.getColor(), "red");
//        }
//    }
//
//    @Test
//    public void experiment() {
//        AppleSearchCriteria searchCriteria1 = new AppleSearchCriteria() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals("red");
//            }
//        };
//
//        var searchCriteria2 = new AppleSearchCriteria() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals("green");
//            }
//        };
//
//        AppleSearchCriteria searchCriteria3 = apple -> apple.getColor().equals("red");
//
//        AppleSearchCriteria searchCriteria4 = new AppleSearchCriteria() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals("red");
//            }
//        };
//
//    }
//
//    @Test
//    public void shouldFindRedApplesBySearchCriteriaLambda() {
//        var appleWarehouse = new AppleWarehouse();
//        var apples = appleWarehouse.findApples(apple -> apple.getColor().equals("red"));
//        assertEquals(apples.size(), 3);
//        for (Apple apple : apples) {
//            assertEquals(apple.getColor(), "red");
//        }
//    }
//
//
//}