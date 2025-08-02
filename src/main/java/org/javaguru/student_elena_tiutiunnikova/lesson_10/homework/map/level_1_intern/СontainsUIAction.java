package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;


import java.util.Scanner;

class СontainsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public СontainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        if (bookDatabase.countAllBooks() == 0) {
            System.out.println("Библиотека пуста. Невозможно выполнить поиск.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine().trim();

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine().trim();

        System.out.print("Введите год выпуска книги: ");
        String year = scanner.nextLine().trim();

        Book book = new Book(author, title, year);

        if (bookDatabase.contains(book)) {
            System.out.println("Такая книга уже есть в базе данных.");
        } else {
            System.out.println("Такой книги нет в базе данных.");
        }
    }
}
