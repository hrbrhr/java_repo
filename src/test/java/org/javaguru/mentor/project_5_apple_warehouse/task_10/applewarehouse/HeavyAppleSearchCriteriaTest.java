package org.javaguru.mentor.project_5_apple_warehouse.task_10.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HeavyAppleSearchCriteriaTest {

    private HeavyAppleSearchCriteria criteria = new HeavyAppleSearchCriteria();

    @Test
    public void shouldSucceed() {
        Apple apple = new Apple("red", 200);
        assertTrue(criteria.test(apple));
    }

    @Test
    public void shouldFail() {
        Apple apple = new Apple("red", 100);
        assertFalse(criteria.test(apple));
    }

}