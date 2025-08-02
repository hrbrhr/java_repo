package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.List;
import java.util.Map;

class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Map<String, List<Book>> authorToBooksMap = bookDatabase.getAuthorToBooksMap();

        if (authorToBooksMap.isEmpty()) {
            System.out.println("Библиотека пуста. Список авторов и их книг недоступен.");
            return;
        } else {
            System.out.println("Cписок книг автора в библиотеке: ");

            authorToBooksMap.forEach((author, books) -> {
                System.out.println("Автор: " + author);
                books.forEach(book -> System.out.println("  - \"" + book.getTitle() + "\" (" + book.getYearOfIssue() + ")"));
                System.out.println();
            });
        }
    }

}
