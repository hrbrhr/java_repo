package org.javaguru.mentor.project_4_apple_warehouse.step_13.applewarehouse;

class GreenAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
