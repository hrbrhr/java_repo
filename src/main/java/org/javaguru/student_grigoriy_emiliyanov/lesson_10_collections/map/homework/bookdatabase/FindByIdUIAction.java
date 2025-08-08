package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework.bookdatabase;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите id книги с консоли у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input book id:");
        Long id = Long.parseLong(scanner.nextLine());
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        Optional<Book> book = bookDatabase.findById(id);
        // выведите на консоль результаты поиска
        book.ifPresentOrElse(System.out::println, new Runnable() {
            @Override
            public void run() {
                System.out.println("No book with id: " + id);
            }
        });
    }

}
