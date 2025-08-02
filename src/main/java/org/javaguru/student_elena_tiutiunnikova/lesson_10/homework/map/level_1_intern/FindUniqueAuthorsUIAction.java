package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Scanner;
import java.util.Set;

class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueAuthors = bookDatabase.findUniqueAuthors();
        if (uniqueAuthors.isEmpty()) {
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println("Список уникальных авторов в библиотеке: " + uniqueAuthors);
        }
    }

}
