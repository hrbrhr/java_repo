package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

import com.sun.source.tree.BreakTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {
    @Test
    public void shouldFindAllGreenApples() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.GREEN, 90));
        expected.add(new Apple(Color.GREEN, 50));
        assertEquals(expected, warehouse.findApplesByColor(Color.GREEN));
    }

    @Test
    public void shouldFindRedApples() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 100));
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        assertEquals(expected, warehouse.findApplesByColor(Color.RED));
    }

    @Test
    public void shouldFindApplesHavierThan() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.YELLOW, 170));
        assertEquals(expected, warehouse.findApplesHavierThan(150));
    }

    @Test
    public void shouldFindGreenApplesCriteria() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.GREEN, 90));
        expected.add(new Apple(Color.GREEN, 50));
        AppleCriteria criteria = new AppleGreenCriteria();
        assertEquals(expected, warehouse.findApples(criteria));
    }

    @Test
    public void shouldFindRedApplesCriteria() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 100));
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        AppleCriteria criteria = new AppleRedCriteria();
        assertEquals(expected, warehouse.findApples(criteria));
    }

    @Test
    public void shouldFindHavierApplesCriteria() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.YELLOW, 170));
        AppleHeavierThan150Criteria criteria = new AppleHeavierThan150Criteria();
        assertEquals(expected, warehouse.findApples(criteria));
    }

    @Test
    public void shouldFindLighterApplesCriteria() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 100));
        expected.add(new Apple(Color.GREEN, 90));
        expected.add(new Apple(Color.GREEN, 50));
        expected.add(new Apple(Color.YELLOW, 50));
        AppleLighterThan150Criteria criteria = new AppleLighterThan150Criteria();
        assertEquals(expected, warehouse.findApples(criteria));
    }
    @Test
    public void shouldFindGreenApplesCriteriaAnonymous() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.GREEN, 90));
        expected.add(new Apple(Color.GREEN, 50));
        AppleCriteria criteria = new AppleCriteria() {
            public boolean isAccepted(Apple apple) {
                return apple.getColor().equals(Color.GREEN);
            }
        };
        assertEquals(expected, warehouse.findApples(criteria));
    }

    @Test
    public void shouldFindRedApplesCriteriaAnonymous() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 100));
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        AppleCriteria criteria = new AppleCriteria() {
            @Override
            public boolean isAccepted(Apple apple) {
                return apple.getColor().equals(Color.RED);
            }
        };
        assertEquals(expected, warehouse.findApples(criteria));
    }

    @Test
    public void shouldFindHavierApplesCriteriaAnonymous() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 160));
        expected.add(new Apple(Color.RED, 200));
        expected.add(new Apple(Color.GREEN, 200));
        expected.add(new Apple(Color.YELLOW, 170));
        AppleCriteria criteria = new AppleCriteria() {
            @Override
            public boolean isAccepted(Apple apple) {
                return apple.getWeight() > 150;
            }
        };
        assertEquals(expected, warehouse.findApples(criteria));
    }

    @Test
    public void shouldFindLighterApplesCriteriaAnonymous() {
//        List<Apple> expected = new ArrayList<>();
//        expected.add(new Apple(Color.RED, 100));
//        expected.add(new Apple(Color.RED, 160));
//        expected.add(new Apple(Color.RED, 200));
//        expected.add(new Apple(Color.GREEN, 200));
//        expected.add(new Apple(Color.GREEN, 90));
//        expected.add(new Apple(Color.GREEN, 50));
//        expected.add(new Apple(Color.YELLOW, 50));
//        expected.add(new Apple(Color.YELLOW, 170));
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple(Color.RED, 100));
        expected.add(new Apple(Color.GREEN, 90));
        expected.add(new Apple(Color.GREEN, 50));
        expected.add(new Apple(Color.YELLOW, 50));
        AppleCriteria criteria = new AppleCriteria() {
            @Override
            public boolean isAccepted(Apple apple) {
                return apple.getWeight() < 150;
            }
        };
        assertEquals(expected, warehouse.findApples(criteria));
    }
}