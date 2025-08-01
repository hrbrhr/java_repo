package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleRedCriteriaTest {
    @Test
    public void shouldAcceptRedApple() {
        AppleRedCriteria redApplesCriteria = new AppleRedCriteria();
        Apple red = new Apple(Color.RED, 200);
        assertTrue(redApplesCriteria.isAccepted(red));
    }

    @Test
    public void shouldNotAcceptOtherThanRedApple() {
        AppleRedCriteria redApplesCriteria = new AppleRedCriteria();
        Apple green = new Apple(Color.GREEN, 200);
        assertFalse(redApplesCriteria.isAccepted(green));
    }
}