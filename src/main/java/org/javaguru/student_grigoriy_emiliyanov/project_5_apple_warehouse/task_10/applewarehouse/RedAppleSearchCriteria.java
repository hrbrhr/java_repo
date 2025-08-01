package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.task_10.applewarehouse;

class RedAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
