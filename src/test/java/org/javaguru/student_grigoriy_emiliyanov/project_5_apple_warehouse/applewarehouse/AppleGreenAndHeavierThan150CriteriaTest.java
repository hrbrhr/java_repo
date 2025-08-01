package org.javaguru.student_grigoriy_emiliyanov.project_5_apple_warehouse.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleGreenAndHeavierThan150CriteriaTest {
    @Test
    public void shouldAcceptGreenHavierThan150() {
        AppleGreenAndHeavierThan150Criteria criteria = new AppleGreenAndHeavierThan150Criteria();
        Apple greenAndHeavy = new Apple(Color.GREEN, 151);
        assertTrue(criteria.isAccepted(greenAndHeavy));
    }

    @Test
    public void shouldAcceptRedHavierThan150() {
        AppleGreenAndHeavierThan150Criteria criteria = new AppleGreenAndHeavierThan150Criteria();
        Apple redAndHeavy = new Apple(Color.RED, 151);
        assertFalse(criteria.isAccepted(redAndHeavy));
    }

    @Test
    public void shouldNotAcceptGreenLighterThan150() {
        AppleGreenAndHeavierThan150Criteria criteria = new AppleGreenAndHeavierThan150Criteria();
        Apple greenAndLight = new Apple(Color.GREEN, 149);
        assertFalse(criteria.isAccepted(greenAndLight));
    }
}