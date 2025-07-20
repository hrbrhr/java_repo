package org.javaguru.student_elena_tiutiunnikova.project_5_apple_warehouse;

class LightAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean test (Apple apple) {return apple.getWheith() < 150; }

}
