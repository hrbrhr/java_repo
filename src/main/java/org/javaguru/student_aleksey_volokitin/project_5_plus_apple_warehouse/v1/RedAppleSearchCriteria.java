package org.javaguru.student_aleksey_volokitin.project_5_plus_apple_warehouse.v1;

class RedAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
