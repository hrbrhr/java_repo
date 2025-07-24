package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Optional;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите id книги: ");
        String id = scanner.nextLine().trim();
        boolean removed = bookDatabase.delete(Long.valueOf(id));
        if (removed) {
            System.out.println("Книга с ID " + id + " успешно удалена.");
        } else {
            System.out.println("Книга с ID " + id + " не найдена.");
        }

    }

}
