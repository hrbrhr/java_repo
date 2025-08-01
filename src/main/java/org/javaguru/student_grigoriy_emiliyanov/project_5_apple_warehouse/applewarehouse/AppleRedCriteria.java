package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

class AppleRedCriteria implements AppleCriteria {
    @Override
    public boolean isAccepted(Apple apple) {
        return apple.getColor().equals(Color.RED);
    }
}
