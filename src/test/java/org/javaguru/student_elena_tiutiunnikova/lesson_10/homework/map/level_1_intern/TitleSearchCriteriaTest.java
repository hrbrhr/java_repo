package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleSearchCriteriaTest {

    @Test
    void testMatchTitleSuccessful () {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");

        TitleSearchCriteria result = new TitleSearchCriteria("Ruslan y Lyudmila");
        assertTrue(result.match(book1));
    }

    @Test
    void testMatchTitleFailed () {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");

        TitleSearchCriteria result = new TitleSearchCriteria("Dubrovsky");
        assertFalse(result.match(book1));
    }

}