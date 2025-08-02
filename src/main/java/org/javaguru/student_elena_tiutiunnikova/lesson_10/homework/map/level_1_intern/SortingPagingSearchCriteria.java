package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Comparator;
import java.util.Optional;

class SortingPagingSearchCriteria implements SearchCriteria {

    private final SearchCriteria innerCriteria;
    private final Paging paging;
    private final Comparator<Book> comparator;

    public SortingPagingSearchCriteria(SearchCriteria innerCriteria, Paging paging) {
        this(innerCriteria, paging, null);
    }

    public SortingPagingSearchCriteria(SearchCriteria innerCriteria, Paging paging, Comparator<Book> comparator) {
        this.innerCriteria = innerCriteria;
        this.paging = paging;
        this.comparator = comparator;
    }

    @Override
    public boolean match(Book book) {
        return innerCriteria.match(book);
    }

    @Override
    public Optional<Paging> getPaging() {
        return Optional.ofNullable(paging);
    }

    @Override
    public Optional<Comparator<Book>> getSortingComparator() {
        return Optional.ofNullable(comparator);
    }

}
