package org.javaguru.student_elena_tiutiunnikova.project_5_apple_warehouse;

import java.util.List;

class GreenAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean test (Apple apple) {return apple.getColour().equals("green"); }

}
