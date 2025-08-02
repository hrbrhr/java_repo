package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Scanner;
import java.util.Set;

class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueTiteles = bookDatabase.findUniqueTitles();
        if (uniqueTiteles.isEmpty()) {
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println("Список уникальных названий книг в библиотеке: " + uniqueTiteles);
        }
    }
}
