package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;


import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine().trim();

        List<Book> books = bookDatabase.findByAuthor(author);
        if (books.isEmpty()) {
            System.out.println("Книги автора " + author + " не найдены.");
        } else {
            System.out.println("Найдена автора:" + author);
            for (Book book : books) {
                System.out.println("ID: " + book.getId());
                System.out.println("Название: " + book.getTitle());
                System.out.println("Год выпуска: " + book.getYearOfIssue());
            }
        }

    }

}
