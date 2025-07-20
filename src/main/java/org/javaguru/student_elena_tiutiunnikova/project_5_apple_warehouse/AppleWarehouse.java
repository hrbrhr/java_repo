package org.javaguru.student_elena_tiutiunnikova.project_5_apple_warehouse;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {

    public List<Apple> findGreenApples() {
        List <Apple> apples = getAllApples();
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColour().equals("green")) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> findRedApple() {
        List<Apple> apples = getAllApples();
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColour().equals("red")) {
                redApples.add(apple);
            }
        }
        return redApples;
    }

    public List<Apple> findAppleByColour (String colour) {
        List<Apple> apples = getAllApples();
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColour().equals(colour)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findHeavyApples (int wheith) {
        List<Apple> apples = getAllApples();
        List<Apple> heavyApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWheith() > wheith) {
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }

    List<Apple> findApples(AppleSearchCriteria searchCriteria) {
        List<Apple> apples = getAllApples();
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (searchCriteria.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    private List<Apple> getAllApples() {
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


}
