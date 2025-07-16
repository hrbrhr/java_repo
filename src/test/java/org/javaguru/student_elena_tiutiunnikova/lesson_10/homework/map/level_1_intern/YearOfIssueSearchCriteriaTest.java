package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfIssueSearchCriteriaTest {

    @Test
    void matchYearSuccessful () {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        YearOfIssueSearchCriteria result = new YearOfIssueSearchCriteria("1820");
        assertTrue(result.match(book1));
    }

    @Test
    void matchYearFailed () {
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        YearOfIssueSearchCriteria result = new YearOfIssueSearchCriteria("1822");
        assertFalse(result.match(book1));
    }

}