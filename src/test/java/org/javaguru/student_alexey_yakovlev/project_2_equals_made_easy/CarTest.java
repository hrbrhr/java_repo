package org.javaguru.student_alexey_yakovlev.project_2_equals_made_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void shouldBeEqualsToItSelf() {
        Car car = new Car("A", "B", 4);
        assertTrue(car.equals(car));
    }

    @Test
    public void shouldNotBeEqualsToNull() {
        Car car = new Car("A", "B", 4);
        assertFalse(car.equals(null));
    }

    @Test
    public void shouldNotBeEquals() {
        Car car1 = new Car("A", "B", 4);
        Car car2 = new Car("A", "B", 4);
        assertTrue(car1.equals(car2));
    }

    @Test
    public void compareToInstanceOfDifferentClass() {
        Car car = new Car("Audi", "A7", 4);
        Book book = new Book("A", "B", 10);
        assertFalse(car.equals(book));
    }

    @Test
    public void instanceOfTrue() {
        Car car = new Car("Audi", "A7", 4);
        assertTrue(car instanceof Car);
        assertTrue((Object)car instanceof Car);
    }

    @Test
    public void instanceOfFalse() {
        Car car = new Car("Audi", "A7", 4);
        assertFalse((Object)car instanceof Book);
    }

    @Test
    public void instanceOfPlusConvert() {
        Object object = new Car("Audi", "A7", 4);
        if (object instanceof Car car) {
            assertEquals(car.getBrand(), "Audi");
            assertEquals(car.getModel(), "A7");
        }
    }

    @Test
    public void equalsTrue() {
        Car car1 = new Car("Audi", "A7", 4);
        Car car2 = new Car("Audi", "A7", 4);
        assertTrue(car1.equals(car2));
    }

    @Test
    public void equalsFalseBrandsAreDifferent() {
        Car car1 = new Car("Audi", "A7", 4);
        Car car2 = new Car("BMW", "A7", 4);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void equalsFalseModelsAreDifferent() {
        Car car1 = new Car("Audi", "A7", 4);
        Car car2 = new Car("Audi", "A8", 4);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void equalsFalseBrandsAreDifferentNull() {
        Car car1 = new Car("Audi", "A7", 4);
        Car car2 = new Car(null, "A7", 4);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void equalsFalseModelsAreDifferentNull() {
        Car car1 = new Car("Audi", "A7", 4);
        Car car2 = new Car("Audi", null, 4);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void equalsFalse() {
        Car car1 = new Car("Audi", "A7", 4);
        Car car2 = new Car("BMW", "M3", 4);
        assertFalse(car1.equals(car2));
    }
}