package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
       return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }

}
