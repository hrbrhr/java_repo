package org.javaguru.student_aleksey_volokitin.project_5_apple_warehouse.v1;

class HeavyWeightAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
