package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_1_8_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    public void task2_test1_shouldBeEqualsToItself() {
        Car car = new Car("Toyota", "Camry");
        assertTrue(car.equals(car));
    }

    @Test
    public void task2_test2_shouldNotBeEqualsToNull() {
        Car car = new Car("Toyota", "Camry");
        assertFalse(car.equals(null));
    }

    @Test
    public void task3_test3_shouldNotBeEquals() {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Toyota", "Camry");
        assertFalse(car1.equals(car2));
    }

    @Test
    public void task4_test4_compareToInstanceOfDifferentClass() {
        Book book = new Book("A", "B");
        Car car = new Car("Porsche", "911");
        assertFalse(book.equals(car));
    }

    @Test
    public void task6_test5_instanceofTrue() {
        Car car = new Car("Toyota", "Camry");
        assertTrue(car instanceof Car);
    }

    @Test
    public void task6_test6_instanceofTrue() {
        Car car = new Car("Toyota", "Camry");
        assertTrue((Object)car instanceof Car);
    }

    @Test
    public void task6_test7_instanceofFalse() {
        Car car = new Car("Toyota", "Camry");
        assertFalse((Object)car instanceof Book);
    }

    @Test
    public void task7_test8_instanceofPlusConvert() {
        Object object = new Car("Toyota", "Camry");
        if (object instanceof Car car) {
            assertEquals(car.getBrand(), "Toyota");
            assertEquals(car.getModel(), "Camry");
        }
    }

}