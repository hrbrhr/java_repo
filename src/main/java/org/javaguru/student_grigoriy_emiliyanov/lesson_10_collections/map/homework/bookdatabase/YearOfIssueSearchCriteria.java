package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework.bookdatabase;

class YearOfIssueSearchCriteria implements SearchCriteria {
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если год выпуска книги совпадает с this.yearOfIssueToSearch
        // иначе return false
        // добавьте в класс Book новое свойство - yearOfIssue - год выпуска
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }

}
