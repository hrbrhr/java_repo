package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleLighterThan150CriteriaTest {
    @Test
    public void shouldAcceptLighterThan150() {
        AppleLighterThan150Criteria applesLighterThan150Criteria = new AppleLighterThan150Criteria();
        Apple green = new Apple(Color.GREEN, 149);
        assertTrue(applesLighterThan150Criteria.isAccepted(green));
    }

    @Test
    public void shouldNotAcceptHavierThan150() {
        AppleLighterThan150Criteria applesLighterThan150Criteria = new AppleLighterThan150Criteria();
        Apple green = new Apple(Color.GREEN, 200);
        assertFalse(applesLighterThan150Criteria.isAccepted(green));
    }
}