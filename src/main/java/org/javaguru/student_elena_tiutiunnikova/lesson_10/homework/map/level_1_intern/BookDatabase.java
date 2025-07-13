package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

interface BookDatabase {

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);

}
