package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите все данные о книге с консоли у пользователя
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        // сохраните его в базу данных: bookDatabase.save(book);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine().trim();

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine().trim();

        System.out.print("Введите год выпуска книги: ");
        String yearOfIssue = scanner.nextLine().trim();

        Book book = new Book(author, title, yearOfIssue);
        Long id = bookDatabase.save(book);

    }

}
