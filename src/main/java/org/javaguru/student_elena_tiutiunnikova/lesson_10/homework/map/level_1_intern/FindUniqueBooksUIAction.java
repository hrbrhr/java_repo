package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Set;

class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<Book> uniqueBooks = bookDatabase.findUniqueBooks();
        if (uniqueBooks.isEmpty()) {
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println("Список уникальных книг в библиотеке: " + uniqueBooks);
            for (Book book : uniqueBooks) {
                System.out.println("ID: " + book.getId());
                System.out.println("Автор: " + book.getAuthor());
                System.out.println("Название: " + book.getTitle());
                System.out.println("Год выпуска: " + book.getYearOfIssue());
                System.out.println();
            }
        }
    }
}
