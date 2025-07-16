package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndSearchCriteriaTest {

    @Test
    void matchAndSearchSuccessful() {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");

        SearchCriteria author = new AuthorSearchCriteria("Pushkin");
        SearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("1820");
        AndSearchCriteria result = new AndSearchCriteria(author, yearOfIssue);

        assertTrue(result.match(book1));
    }

    @Test
    void matchAndSearchFailed() {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");

        SearchCriteria author = new AuthorSearchCriteria("Pushkin");
        SearchCriteria yearOfIssue = new YearOfIssueSearchCriteria("1822");
        AndSearchCriteria result = new AndSearchCriteria(author, yearOfIssue);

        assertFalse(result.match(book1));
    }

}