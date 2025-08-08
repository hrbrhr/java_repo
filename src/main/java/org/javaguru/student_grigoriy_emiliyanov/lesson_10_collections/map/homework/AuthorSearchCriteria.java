package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если автор книги совпадает с this.authorToSearch
        // иначе return false
        return book.getAuthor().equalsIgnoreCase(authorToSearch);
    }

}
