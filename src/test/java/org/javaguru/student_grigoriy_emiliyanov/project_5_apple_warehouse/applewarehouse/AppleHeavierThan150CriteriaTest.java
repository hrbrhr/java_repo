package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleHeavierThan150CriteriaTest {
    @Test
    public void shouldAcceptHavierThan150() {
        AppleHeavierThan150Criteria applesHavierThan150Criteria = new AppleHeavierThan150Criteria();
        Apple green = new Apple(Color.GREEN, 151);
        assertTrue(applesHavierThan150Criteria.isAccepted(green));
    }

    @Test
    public void shouldNotAcceptLighterThan150() {
        AppleHeavierThan150Criteria applesHavierThan150Criteria = new AppleHeavierThan150Criteria();
        Apple green = new Apple(Color.GREEN, 150);
        assertFalse(applesHavierThan150Criteria.isAccepted(green));
    }
}