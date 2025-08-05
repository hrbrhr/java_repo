package org.javaguru.student_grigoriy_emiliyanov.lesson_13_streams.homework;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {
    @Test
    public void shouldFindGreenApples() {
//        List<Apple> expected = List.of(
//                new Apple("red", 100),
//                new Apple("red", 160),
//                new Apple("red", 200),
//                new Apple("green", 200),
//                new Apple("green", 90),
//                new Apple("green", 50),
//                new Apple("yellow", 50),
//                new Apple("yellow", 170)
//        );
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> expected = List.of(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        assertEqualCollectionsIgnoreOrder(expected, fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "green"));
    }

    @Test
    public void shouldFindRedApples() {
//        List<Apple> expected = List.of(
//                new Apple("red", 100),
//                new Apple("red", 160),
//                new Apple("red", 200),
//                new Apple("green", 200),
//                new Apple("green", 90),
//                new Apple("green", 50),
//                new Apple("yellow", 50),
//                new Apple("yellow", 170)
//        );
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> expected = List.of(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
        assertEqualCollectionsIgnoreOrder(expected, fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "red"));
    }

    @Test
    public void shouldFindHeavierThanApples() {
//        List<Apple> expected = List.of(
//                new Apple("red", 100),
//                new Apple("red", 160),
//                new Apple("red", 200),
//                new Apple("green", 200),
//                new Apple("green", 90),
//                new Apple("green", 50),
//                new Apple("yellow", 50),
//                new Apple("yellow", 170)
//        );
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> expected = List.of(
                new Apple("red", 160),
                new Apple("green", 200),
                new Apple("red", 200),
                new Apple("yellow", 170)
        );
        assertEqualCollectionsIgnoreOrder(expected, fruitStorage.findApplesHeavierThan(fruitStorage.getAllApples(), 150));
    }

    @Test
    public void shouldFindLighterThanApples() {
//        List<Apple> expected = List.of(
//                new Apple("red", 100),
//                new Apple("red", 160),
//                new Apple("red", 200),
//                new Apple("green", 200),
//                new Apple("green", 90),
//                new Apple("green", 50),
//                new Apple("yellow", 50),
//                new Apple("yellow", 170)
//        );
        FruitStorage fruitStorage = new FruitStorage();
        ApplePredicate criteria = new LighterThan150ApplePredicate();

        List<Apple> expected = List.of(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50)
        );
        assertEqualCollectionsIgnoreOrder(expected, fruitStorage.findApplesByCriteria(fruitStorage.getAllApples(), criteria));
    }

    private <T> void assertEqualCollectionsIgnoreOrder(Collection<T> list1, Collection<T> list2) {
        if (list1.size() != list2.size()) assertTrue(false);
        assertTrue(list1.containsAll(list2) && list2.containsAll(list1));
    }
}