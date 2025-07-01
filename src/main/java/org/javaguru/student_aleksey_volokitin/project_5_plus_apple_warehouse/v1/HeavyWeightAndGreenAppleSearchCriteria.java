package org.javaguru.student_aleksey_volokitin.project_5_plus_apple_warehouse.v1;

class HeavyWeightAndGreenAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria greenApples = new GreenAppleSearchCriteria();
    private HeavyWeightAppleSearchCriteria heavyApples = new HeavyWeightAppleSearchCriteria();
    @Override
    public boolean test(Apple apple) {
        return greenApples.test(apple) && heavyApples.test(apple);
    }
}
