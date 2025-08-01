package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    private List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(Color.RED, 100));
        apples.add(new Apple(Color.RED, 160));
        apples.add(new Apple(Color.RED, 200));
        apples.add(new Apple(Color.GREEN, 200));
        apples.add(new Apple(Color.GREEN, 90));
        apples.add(new Apple(Color.GREEN, 50));
        apples.add(new Apple(Color.YELLOW, 50));
        apples.add(new Apple(Color.YELLOW, 170));
        return apples;
    }

    public List<Apple> getGreenApples() {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals(Color.GREEN))
                .collect(Collectors.toList());
    }

    public List<Apple> getRedApples() {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals(Color.RED))
                .collect(Collectors.toList());
    }

    public List<Apple> findApplesByColor(Color color) {
        return getAllApples().stream()
                .filter(apple -> apple.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public List<Apple> findApplesHavierThan(int weight) {
        return getAllApples().stream()
                .filter(apple -> apple.getWeight() > weight)
                .collect(Collectors.toList());
    }
    List<Apple> findApples(AppleCriteria searchCriteria) {
        return getAllApples().stream()
                .filter(searchCriteria::isAccepted)
                .collect(Collectors.toList());
    }
}
