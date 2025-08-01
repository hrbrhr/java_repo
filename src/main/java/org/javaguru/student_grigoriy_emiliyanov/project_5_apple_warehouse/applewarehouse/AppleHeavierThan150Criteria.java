package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

class AppleHeavierThan150Criteria implements AppleCriteria {
    @Override
    public boolean isAccepted(Apple apple) {
        return apple.getWeight() > 150;
    }
}
