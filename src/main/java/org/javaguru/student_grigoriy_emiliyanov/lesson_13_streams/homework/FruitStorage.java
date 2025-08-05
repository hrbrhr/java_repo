package org.javaguru.student_grigoriy_emiliyanov.lesson_13_streams.homework;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }


    public List<Apple> findApplesByColor(List<Apple> apples, String color) {
        return apples.stream()
                .filter(apple -> apple.getColor().equalsIgnoreCase(color))
                .toList();
    }

    public List<Apple> findApplesHeavierThan(List<Apple> apples, int weight) {
        return apples.stream()
                .filter(apple -> apple.getWeight() > weight)
                .toList();
    }

    public List<Apple> findApplesByCriteria(List<Apple> apples, ApplePredicate criteria) {
        return apples.stream()
                .filter(criteria::test)
                .toList();
    }
}
