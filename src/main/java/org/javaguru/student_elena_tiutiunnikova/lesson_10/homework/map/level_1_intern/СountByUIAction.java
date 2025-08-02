package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Scanner;

class СountByUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public СountByUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute () {
        Scanner scanner = new Scanner(System.in);

        int count = bookDatabase.countAllBooks();
        if (count == 0) {
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println("Количество книг в библиотеке составляет: " + count);
        }

    }
}
