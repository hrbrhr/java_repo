package org.javaguru.student_alexey_yakovlev.project_2_equals_made_easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void shouldBeEqualsToItSelf() {
        Book book = new Book("A", "B", 10);
        assertTrue(book.equals(book));
    }

    @Test
    public void shouldBeNotEqualsToNull() {
        Book book = new Book("A", "B", 10);
        assertFalse(book.equals(null));
    }

    @Test
    public void shouldNotBeEquals() {
        Book book1 = new Book("A", "B", 10);
        Book book2 = new Book("A", "B", 10);
        assertTrue(book1.equals(book2));
    }

    @Test
    public void compareToInstanceOfDifferentClass() {
        Book book = new Book("A", "B", 10);
        Car car = new Car("Audi", "A7", 10);
        assertFalse(book.equals(car));
    }

    @Test
    public void instanceOfTrue() {
        Book book = new Book("A", "B", 10);
        assertTrue(book instanceof Book);
        assertTrue((Object)book instanceof Book);
    }

    @Test
    public void instanceOfFalse() {
        Book book = new Book("A", "B", 10);
        assertFalse((Object)book instanceof Car);
    }

    @Test
    public void instanceOfPlusConvert() {
        Object object = new Book("A", "B", 10);
        if (object instanceof Book book) {
            assertEquals(book.getAuthor(), "A");
            assertEquals(book.getTitle(), "B");
        }
    }

    @Test
    public void equalsTrue() {
        Book book1 = new Book("A", "B", 10);
        Book book2 = new Book("A", "B", 10);
        assertTrue(book1.equals(book2));
    }

    @Test
    public void equalsFalseAuthorsAreDifferent() {
        Book book1 = new Book("A", "B", 10);
        Book book2 = new Book("B", "B", 10);
        assertFalse(book1.equals(book2));
    }

    @Test
    public void equalsFalseTitlesAreDifferent() {
        Book book1 = new Book("A", "B", 10);
        Book book2 = new Book("A", "A", 10);
        assertFalse(book1.equals(book2));
    }

    @Test
    public void equalsFalseAuthorsAreDifferentNull() {
        Book book1 = new Book("A", "B", 10);
        Book book2 = new Book(null, "B", 10);
        assertFalse(book1.equals(book2));
    }

    @Test
    public void equalsFalseTitlesDifferentNull() {
        Book book1 = new Book("A", "B", 10);
        Book book2 = new Book("A", null, 10);
        assertFalse(book1.equals(book2));
    }

    @Test
    public void equalsFalse() {
        Book book1 = new Book("A", "A", 10);
        Book book2 = new Book("X", "Y", 10);
        assertFalse(book1.equals(book2));
    }
}