package org.javaguru.student_elena_tiutiunnikova.project_2_equals_made_easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void shouldBeEqualsToItself () {
        Car car = new Car("A", "B");
        assertTrue(car.equals(car));
    }

    @Test
    public void shouldBeEqualsToNull () {
        Car car = new Car("A", "B");
        assertFalse(car.equals(null));
    }

    @Test
    public void shouldNotBeEquals () {
        Car car1 = new Car("A", "B");
        Car car2 = new Car("A", "B");
        assertFalse(car1.equals(car2));
    }

    @Test
    public void compareToInstanceOfDifferentClass () {
        Book book = new Book("A", "B", 10);
        Car car = new Car("Porshe", "911");
        assertFalse(book.equals(car));
    }

    @Test
    public void instanceOfTrue () {
        Car car = new Car("Porshe", "911");
        assertTrue(car instanceof Car);
        assertTrue((Object)car instanceof Car);
    }

    @Test
    public void instanceOfFalse () {
        Car car = new Car("Porshe", "911");
        assertFalse((Object)car instanceof Book);
    }

    @Test
    public void instanceofPlusConvert() {
        Object object = new Car("Porshe", "911");
        if (object instanceof Car car) {
            assertEquals(car.getBrand(), "Porshe");
            assertEquals(car.getModel(), "911");
        }
    }

    @Test
    public void equalsTrue () {
        Car car1 = new Car("Porshe", "911");
        Car car2 = new Car("Porshe", "911");
        assertTrue(car1.equals(car2));
    }

    @Test
    public void equalsFalseBrandsAreDifferent () {
        Car car1 = new Car("Porshe", "911");
        Car car2 = new Car("BMW", "911");
        assertFalse(car1.equals(car2));
    }

    @Test
    public void equalsFalseModelsAreDifferent () {
        Car car1 = new Car("Porshe", "911");
        Car car2 = new Car("Porshe", "101");
        assertFalse(car1.equals(car2));
    }

    @Test
    public void equalsFalseBrandsAreDifferentNull () {
        Car car1 = new Car("Porshe", "911");
        Car car2 = new Car(null, "101");
        assertFalse(car1.equals(car2));
    }

    @Test
    public void equalsFalseModelsAreDifferentNull () {
        Car car1 = new Car("Porshe", "911");
        Car car2 = new Car("Porshe", null);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void equalsFalse () {
        Car car1 = new Car("Porshe", "911");
        Car car2 = new Car("BMW", "M5");
        assertFalse(car1.equals(car2));
    }

}