package org.javaguru.mentor.project_4_apple_warehouse.step_12.applewarehouse;

class HeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
