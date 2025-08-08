package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework;

import java.util.List;
import java.util.Optional;

interface BookDatabase {
    Long save(Book book);
    int countAllBooks();
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    boolean delete(Long bookId);
    boolean delete(Book book);
    void deleteByAuthor(String author);
}
