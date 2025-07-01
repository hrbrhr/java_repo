package org.javaguru.student_aleksey_volokitin.project_5_apple_warehouse.v1;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    private List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 80));
        apples.add(new Apple("yellow", 150));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("yellow", 90));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("yellow", 110));
        apples.add(new Apple("red", 170));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 250));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple greenApple: apples) {
            if(greenApple.getColor().equals("green")) {
                greenApples.add(greenApple);
            }
        }
        return greenApples;
    }

    public List<Apple> findRedApples() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple greenApple: apples) {
            if(greenApple.getColor().equals("red")) {
                greenApples.add(greenApple);
            }
        }
        return greenApples;
    }

    public List<Apple> findApplesByColor(String appleColor) {
        List<Apple> applesByColor = new ArrayList<>();
        for (Apple appleByColor: apples) {
            if(appleByColor.getColor().equals(appleColor)) {
                applesByColor.add(appleByColor);
            }
        }
        return applesByColor;
    }

    public List<Apple> findApplesHeavierThen(int appleWeight) {
        List<Apple> heavyApples = new ArrayList<>();
        for (Apple heavyApple: apples) {
            if(heavyApple.getWeight() > appleWeight) {
                heavyApples.add(heavyApple);
            }
        }
        return heavyApples;
    }

    public List<Apple> findApples(AppleSearchCriteria searchCriteria) {
        List<Apple> applesSearchCriteria = new ArrayList<>();
        for (Apple appleSearchCriteria: apples) {
            if(searchCriteria.test(appleSearchCriteria)) {
                applesSearchCriteria.add(appleSearchCriteria);
            }
        }
        return applesSearchCriteria;
    }

}
