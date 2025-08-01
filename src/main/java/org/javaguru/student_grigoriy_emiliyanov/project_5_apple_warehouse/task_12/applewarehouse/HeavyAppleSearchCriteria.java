package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.task_12.applewarehouse;

class HeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
