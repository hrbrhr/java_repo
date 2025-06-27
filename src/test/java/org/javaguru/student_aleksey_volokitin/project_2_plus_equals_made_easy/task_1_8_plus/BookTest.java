package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_1_8_plus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    public void task2_test1_shouldBeEqualsToItself() {
        Book book = new Book("A", "B");
        assertTrue(book.equals(book));
    }

    @Test
    public void task2_test2_shouldNotBeEqualsToNull() {
        Book book = new Book("A", "B");
        assertFalse(book.equals(null));
    }

    @Test
    public void task2_test3_shouldNotBeEquals() {
        Book book1 = new Book("A", "B");
        Book book2 = new Book("A", "B");
        assertFalse(book1.equals(book2));
    }

    @Test
    public void task4_test4_compareToInstanceOfDifferentClass() {
        Book book = new Book("A", "B");
        Car car = new Car("Porsche", "911");
        assertFalse(book.equals(car));
    }

    @Test
    public void task6_test5_instanceofTrue() {
        Book book = new Book("A", "B");
        assertTrue(book instanceof Book);
    }

    @Test
    public void task6_test6_instanceofTrue() {
        Book book = new Book("A", "B");
        assertTrue((Object)book instanceof Book);
    }

    @Test
    public void task6_test7_instanceofFalse() {
        Book book = new Book("A", "B");
        assertFalse((Object)book instanceof Car);
    }

    @Test
    public void task7_test8_instanceofPlusConvert() {
        Object object = new Book("A", "B");
        if (object instanceof Book book) {
            assertEquals(book.getAuthor(), "A");
            assertEquals(book.getTitle(), "B");
        }
    }

}