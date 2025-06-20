package org.javaguru.mentor.project_5_apple_warehouse.task_13.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RedAppleSearchCriteriaTest {

    private RedAppleSearchCriteria criteria = new RedAppleSearchCriteria();

    @Test
    public void shouldSucceed() {
        Apple apple = new Apple("red", 200);
        assertTrue(criteria.test(apple));
    }

    @Test
    public void shouldFail() {
        Apple apple = new Apple("green", 200);
        assertFalse(criteria.test(apple));
    }

}