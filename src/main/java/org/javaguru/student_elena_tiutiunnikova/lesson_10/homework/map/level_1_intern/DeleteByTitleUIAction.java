package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название книги, которые Вы хотите удалить из библиотеки: ");
        String titleForRemove = scanner.nextLine().trim();
        bookDatabase.deleteByAuthor(titleForRemove);
        System.out.println("Книги с названием " + titleForRemove + " успешно удалены.");

    }

}


