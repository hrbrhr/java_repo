package org.javaguru.student_grigoriy_emiliyanov.project_2_equals_made_easy.task_8.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void shouldNotBeEqualToOtherType() {
        Car car = new Car("Lada", "Kalina");
        Book book = new Book("Defoe", "Robinson");
        assertFalse(car.equals(book));
    }

    @Test
    public void instanceOfReturnTrue() {
        Car car = new Car("Lada", "Kalina");
        assertTrue(car instanceof Car);
    }

    @Test
    public void instanceOfReturnFalse() {
        Car car = new Car("Lada", "Kalina");
        assertFalse((Object)car instanceof Book);
    }

    @Test
    public void instanceOfPlusVar() {
        Car car = new Car("Lada", "Kalina");
        if (car instanceof Car good) {
            assertEquals("Lada", car.getBrand());
        }

    }
}
