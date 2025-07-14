package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

//    Создайте класс BookDatabaseImpl, который реализует интерфейс BookDatabase.
//    Реализуйте в нём метод  Long save(Book book). Книги внутри класса BookDatabaseImpl
//    храните в списке.

    private List <Book> books = new ArrayList<>();
    private Long currentBookID = 1L;

    @Override
    public Long save(Book book) {
    book.setId(currentBookID);
    books.add(book);
    return currentBookID++;
    }

    @Override
    public boolean delete(Long bookId) {
       return books.removeIf(book -> book.getId().equals(bookId));
    };

    @Override
    public boolean delete(Book book) {
        return books.remove(book);
    };
}
