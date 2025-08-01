package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {
    private List<Book> books = new ArrayList<>();
    private Long size = 1L;
    @Override
    public Long save(Book book) {
        books.add(book);
        return size++;
    }

    @Override
    public boolean delete(Long bookId) {
        if (bookId > books.size()) return false;
        books.remove(bookId);
        return true;
    }
}
