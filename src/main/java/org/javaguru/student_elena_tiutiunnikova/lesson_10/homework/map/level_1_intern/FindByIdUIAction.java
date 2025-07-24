package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
            this.bookDatabase = bookDatabase;
    }

    public void execute() {
            // запросите id книги с консоли у пользователя
            // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
            // выведите на консоль результаты поиска

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите id книги: ");
        String id = scanner.nextLine().trim();

        Optional<Book> bookOpt = bookDatabase.findById(Long.valueOf(id));
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            System.out.println("Найдена книга:");
            System.out.println("ID: " + book.getId());
            System.out.println("Автор: " + book.getAuthor());
            System.out.println("Название: " + book.getTitle());
            System.out.println("Год выпуска: " + book.getYearOfIssue());
        } else {
            System.out.println("Книга с ID " + id + " не найдена.");
        }

    }

}
