package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework.bookdatabase;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Kuper", "Foo", "1234");
        Book book2 = new Book("Kogan", "Zveroboi", "1234");
        Book book3 = new Book("Kuper", "Zveroboi", "1234");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println("*** Author search criteria");
        System.out.println(authorSearchCriteria.match(book1));
        System.out.println(authorSearchCriteria.match(book2));
        System.out.println(authorSearchCriteria.match(book3));
        System.out.println("*** Title search criteria");
        System.out.println(titleSearchCriteria.match(book1));
        System.out.println(titleSearchCriteria.match(book2));
        System.out.println(titleSearchCriteria.match(book3));
        System.out.println("*** Author and Title search criteria");
        System.out.println(searchCriteria.match(book1));
        System.out.println(searchCriteria.match(book2));
        System.out.println(searchCriteria.match(book3));
    }
}
