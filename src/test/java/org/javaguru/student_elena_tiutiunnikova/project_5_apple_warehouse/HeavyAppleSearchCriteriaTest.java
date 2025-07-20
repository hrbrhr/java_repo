package org.javaguru.student_elena_tiutiunnikova.project_5_apple_warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeavyAppleSearchCriteriaTest {

    HeavyAppleSearchCriteria criteria = new HeavyAppleSearchCriteria();

    @Test
    void testFindHeavyApplesSuccessful() {
        Apple apple = new Apple("red", 151);
        assertTrue(criteria.test(apple));
    }

    @Test
    void testFindHeavyApplesFailed() {
        Apple apple = new Apple("red", 51);
        assertFalse(criteria.test(apple));
    }

}