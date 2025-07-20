package org.javaguru.student_elena_tiutiunnikova.project_5_apple_warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightAppleSearchCriteriaTest {

    @Test
    void testFindLightApplesSuccessful() {
        LightAppleSearchCriteria criteria = new LightAppleSearchCriteria();
        Apple apple = new Apple("red", 149);
        assertTrue(criteria.test(apple));
    }

    @Test
    void testFindLightApplesFailed() {
        LightAppleSearchCriteria criteria = new LightAppleSearchCriteria();
        Apple apple = new Apple("red", 151);
        assertFalse(criteria.test(apple));
    }

}