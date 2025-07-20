package org.javaguru.student_elena_tiutiunnikova.project_5_apple_warehouse;

class GreenAndHeavyAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria greenAplles = new GreenAppleSearchCriteria();
    private HeavyAppleSearchCriteria heavyApples = new HeavyAppleSearchCriteria();

    @Override
    public boolean test (Apple apple) {return  greenAplles.test(apple) && heavyApples.test(apple); }

    //apple.getColour().equals("green") && apple.getWheith() > 150;
}
