package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

class SearchCriteriaDemo {

    public static SearchCriteria searchCriteriaTitleAndAuthor (String author, String title) {
        return new AndSearchCriteria(new AuthorSearchCriteria(author), new TitleSearchCriteria(title));
    }

    public static SearchCriteria searchCriteriaYearAndAuthor (String author, String year) {
        return new AndSearchCriteria(new AuthorSearchCriteria(author), new YearOfIssueSearchCriteria(year));
    }
    public static SearchCriteria searchCriteriaOr (String author, String title, String year) {
        return new OrSearchCriteria(new OrSearchCriteria(new TitleSearchCriteria(title), new AuthorSearchCriteria(author)), new YearOfIssueSearchCriteria(year));
    }

    public static BookDatabase bookDatabase () {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor", "1998");
        Book book5 = new Book("Waters", "Nochnoy dozor", "2006");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        return database;
    }

}
