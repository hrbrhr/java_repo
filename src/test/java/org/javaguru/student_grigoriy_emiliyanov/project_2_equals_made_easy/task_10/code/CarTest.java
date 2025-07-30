package org.javaguru.student_grigoriy_emiliyanov.project_2_equals_made_easy.task_10.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void shouldBeEqualsToItself() {
        Car car = new Car("Lada", "Kalina", 2005);
        assertTrue(car.equals(car));
    }

    @Test
    public void shouldNotBeEqualsToNull() {
        Car car = new Car("Lada", "Kalina", 2005);
        assertFalse(car.equals(null));
    }

    @Test
    public void shouldBeEquals() {
        Car car1 = new Car("Lada", "Kalina", 2005);
        Car car2 = new Car("Lada", "Kalina", 2005);
        assertTrue(car1.equals(car2));
    }

    @Test
    public void shouldNotBeEquals() {
        Car car1 = new Car("Lada", "Kalina", 2005);
        Car car2 = new Car("Lada", "Granta", 2010);
        Car car3 = new Car("Lada", "Kalina", 2010);
        assertFalse(car1.equals(car2));
        assertFalse(car1.equals(car3));
    }
    @Test
    public void shouldNotBeEqualToOtherType() {
        Car car = new Car("Lada", "Kalina", 2005);
        Book book = new Book("Defoe", "Robinson", 123);
        assertFalse(car.equals(book));
    }

    @Test
    public void instanceOfReturnTrue() {
        Car car = new Car("Lada", "Kalina", 2005);
        assertTrue(car instanceof Car);
    }

    @Test
    public void instanceOfReturnFalse() {
        Car car = new Car("Lada", "Kalina", 2005);
        assertFalse((Object)car instanceof Book);
    }

    @Test
    public void instanceOfPlusVar() {
        Car car = new Car("Lada", "Kalina", 2005);
        if (car instanceof Car good) {
            assertEquals("Lada", car.getBrand());
        }
    }
}
