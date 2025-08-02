package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.List;
import java.util.Map;

class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, Integer> authorToBooksMap = bookDatabase.getEachAuthorBookCount();

        if (authorToBooksMap.isEmpty()) {
            System.out.println("Библиотека пуста. Список авторов и их книг недоступен.");
            return;
        } else {
            System.out.println();
            System.out.println("Cписок уникальных книг каждого автора в библиотеке: ");
            authorToBooksMap.forEach((author, count) -> {
                System.out.println("Автор: " + author + " Кол-во книг: " + count);
                System.out.println();
            });
        }
    }
}
