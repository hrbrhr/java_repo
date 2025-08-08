package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework.bookdatabase;

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
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book year of issue:");
        String yearOfIssue = scanner.nextLine();
        Book book = new Book(author, title, yearOfIssue);
        Long id = bookDatabase.save(book);
        System.out.println("The book was saved with id: " + id);
    }

}
