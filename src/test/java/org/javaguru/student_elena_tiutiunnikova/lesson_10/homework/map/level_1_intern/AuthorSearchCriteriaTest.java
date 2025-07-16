package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorSearchCriteriaTest {

    @Test
    void testMatchSuccessful () {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");

        AuthorSearchCriteria result = new AuthorSearchCriteria("Pushkin");
        assertTrue(result.match(book1));
    }

    @Test
    void testMatchFailed () {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");

        AuthorSearchCriteria result = new AuthorSearchCriteria("Lermontov");
        assertFalse(result.match(book1));
    }

}