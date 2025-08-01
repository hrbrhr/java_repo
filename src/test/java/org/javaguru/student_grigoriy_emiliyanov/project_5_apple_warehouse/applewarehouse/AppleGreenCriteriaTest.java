package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleGreenCriteriaTest {
    @Test
    public void shouldAcceptGreenApple() {
        AppleGreenCriteria greenApplesCriteria = new AppleGreenCriteria();
        Apple green = new Apple(Color.GREEN, 200);
        assertTrue(greenApplesCriteria.isAccepted(green));
    }

    @Test
    public void shouldNotAcceptOtherThanGreenApple() {
        AppleGreenCriteria greenApplesCriteria = new AppleGreenCriteria();
        Apple red = new Apple(Color.RED, 200);
        assertFalse(greenApplesCriteria.isAccepted(red));
    }

}