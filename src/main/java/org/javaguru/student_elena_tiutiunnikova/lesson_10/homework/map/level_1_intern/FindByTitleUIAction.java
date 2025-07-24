package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine().trim();

        List<Book> books = bookDatabase.findByAuthor(title);
        if (books.isEmpty()) {
            System.out.println("Книга с названием " + title + " не найдена.");
        } else {
            System.out.println("Найдены следующие книги с названием " + title + ": ");
            for (Book book : books) {
                System.out.println("ID: " + book.getId());
                System.out.println("Название: " + book.getAuthor());
                System.out.println("Год выпуска: " + book.getYearOfIssue());
            }
        }

    }

}
