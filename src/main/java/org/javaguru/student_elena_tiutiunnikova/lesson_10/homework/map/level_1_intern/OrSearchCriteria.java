package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
       return leftCondition.match(book) || rightCondition.match(book);
    }

}
