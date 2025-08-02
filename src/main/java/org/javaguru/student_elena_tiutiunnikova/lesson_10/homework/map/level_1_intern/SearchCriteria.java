package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Comparator;
import java.util.Optional;

interface SearchCriteria {

    boolean match(Book book);

    default Optional<Paging> getPaging() {
        return Optional.empty();
    }

    default Optional<Comparator<Book>> getSortingComparator() {
        return Optional.empty();
    }

}
