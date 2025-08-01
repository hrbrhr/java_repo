package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

class AppleGreenAndHeavierThan150Criteria implements AppleCriteria {
    private AppleGreenCriteria greenCriteria = new AppleGreenCriteria();
    private AppleHeavierThan150Criteria havyCriteria = new AppleHeavierThan150Criteria();
    @Override
    public boolean isAccepted(Apple apple) {
        return greenCriteria.isAccepted(apple) && havyCriteria.isAccepted(apple);
    }
}
