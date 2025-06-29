package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_10_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void task2_test1_shouldBeEqualsToItself() {
        Car car = new Car("Toyota", "Camry", 200);
        assertTrue(car.equals(car));
    }

    @Test
    public void task2_test2_shouldNotBeEqualsToNull() {
        Car car = new Car("Toyota", "Camry", 200);
        assertFalse(car.equals(null));
    }

    @Test
    public void task3_test3_shouldNotBeEquals() {
        Car car1 = new Car("Toyota", "Camry", 200);
        Car car2 = new Car("Toyota", "Camry", 200);
        assertTrue(car1.equals(car2));
    }

    @Test
    public void task4_test4_compareToInstanceOfDifferentClass() {
        Book book = new Book("A", "B", 200);
        Car car = new Car("Porsche", "911", 500);
        assertFalse(book.equals(car));
    }

    @Test
    public void task6_test5_instanceofTrue() {
        Car car = new Car("Toyota", "Camry", 200);
        assertTrue(car instanceof Car);
    }

    @Test
    public void task6_test6_instanceofTrue() {
        Car car = new Car("Toyota", "Camry", 200);
        assertTrue((Object)car instanceof Car);
    }

    @Test
    public void task6_test7_instanceofFalse() {
        Car car = new Car("Toyota", "Camry", 200);
        assertFalse((Object)car instanceof Book);
    }

    @Test
    public void task7_test8_instanceofPlusConvert() {
        Object object = new Car("Toyota", "Camry", 200);
        if (object instanceof Car car) {
            assertEquals(car.getBrand(), "Toyota");
            assertEquals(car.getModel(), "Camry");
            assertEquals(car.getEnginePower(), 200);
        }
    }

    @Test
    public void task9_test9_equalsTrue() {
        Car car1 = new Car("Toy", "Cam", 200);
        Car car2 = new Car("Toy", "Cam", 200);
        assertTrue(car1.equals(car2));
    }

    @Test
    public void task9_test10_equalsFalseBrandsAreDifferent() {
        Car car1 = new Car("Toy", "Cam", 200);
        Car car2 = new Car("Tay", "Cam", 200);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void task9_test11_equalsFalseModelsAreDifferent() {
        Car car1 = new Car("Toy", "Cam", 200);
        Car car2 = new Car("Toy", "Com", 200);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void task9_test12_equalsFalseBrandsAreDifferentNull() {
        Car car1 = new Car("Toy", "Cam", 200);
        Car car2 = new Car(null, "Cam", 200);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void task9_test13_equalsFalseModelsAreDifferentNull() {
        Car car1 = new Car("Toy", "Cam", 200);
        Car car2 = new Car("Toy", null, 200);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void task9_test14_equalsFalse() {
        Car car1 = new Car("Toy", "Cam", 200);
        Car car2 = new Car("Nis", "Pat", 400);
        assertFalse(car1.equals(car2));
    }

    @Test
    public void task9_test15_equalsFalseModelsAreDifferent() {
        Car car1 = new Car("Toy", "Cam", 200);
        Car car2 = new Car("Toy", "Cam", 100);
        assertFalse(car1.equals(car2));
    }
}