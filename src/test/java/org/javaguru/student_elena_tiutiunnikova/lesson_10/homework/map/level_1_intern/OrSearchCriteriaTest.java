package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrSearchCriteriaTest {

    @Test
    void matchOrSearchSuccessful() {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");

        SearchCriteria author = new AuthorSearchCriteria("Pushkin");
        SearchCriteria title = new TitleSearchCriteria("Dubrovskiy");
        OrSearchCriteria result = new OrSearchCriteria(author, title);

        assertTrue(result.match(book1));
    }

    @Test
    void matchOrSearchFailed() {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");

        SearchCriteria author = new AuthorSearchCriteria("Pushkinn");
        SearchCriteria title = new TitleSearchCriteria("Dubrovskiy");
        OrSearchCriteria result = new OrSearchCriteria(author, title);

        assertFalse(result.match(book1));
    }

}