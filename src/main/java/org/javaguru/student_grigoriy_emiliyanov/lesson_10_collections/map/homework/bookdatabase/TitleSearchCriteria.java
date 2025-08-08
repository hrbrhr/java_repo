package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework.bookdatabase;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если название книги совпадает с this.titleToSearch
        // иначе return false
        return book.getTitle().equalsIgnoreCase(titleToSearch);
    }

}
