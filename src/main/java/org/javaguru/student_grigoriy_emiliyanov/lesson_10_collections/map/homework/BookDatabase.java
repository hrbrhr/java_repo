package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
}
