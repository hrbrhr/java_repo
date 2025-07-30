package org.javaguru.student_grigoriy_emiliyanov.project_2_equals_made_easy.task_3.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {
    @Test
    public void shouldBeEqualsToItself() {
        Car car = new Car("Lada", "Kalina");
        assertTrue(car.equals(car));
    }

    @Test
    public void shouldNotBeEqualsToNull() {
        Car car = new Car("Lada", "Kalina");
        assertFalse(car.equals(null));
    }

    @Test
    public void shouldNotBeEquals() {
        Car car1 = new Car("Lada", "Kalina");
        Car car2 = new Car("Lada", "Kalina");
        assertFalse(car1.equals(car2));
    }
}
