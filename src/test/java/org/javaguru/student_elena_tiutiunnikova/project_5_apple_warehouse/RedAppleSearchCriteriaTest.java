package org.javaguru.student_elena_tiutiunnikova.project_5_apple_warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedAppleSearchCriteriaTest {

    RedAppleSearchCriteria criteria = new RedAppleSearchCriteria();

    @Test
    void testFindRedApplesSuccessful() {
    Apple apple = new Apple("red", 50);
    assertTrue(criteria.test(apple));
    }

    @Test
    void testFindRedApplesFailed() {
        Apple apple = new Apple("green", 50);
        assertFalse(criteria.test(apple));
    }

}