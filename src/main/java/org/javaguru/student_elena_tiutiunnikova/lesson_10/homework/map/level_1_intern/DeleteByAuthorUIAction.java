package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Scanner;

class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя автора, книги которого Вы хотите удалить из библиотеки: ");
        String authorForRemove = scanner.nextLine().trim();
        bookDatabase.deleteByAuthor(authorForRemove);
        System.out.println("Книги автора " + authorForRemove + " успешно удалены.");

    }

}
