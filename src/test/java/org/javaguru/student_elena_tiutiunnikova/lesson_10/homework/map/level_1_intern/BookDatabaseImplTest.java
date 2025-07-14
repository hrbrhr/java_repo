package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {


    @Test
    void testDeleteIDTrue() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        database.save(book1);
        database.save(book2);

        Long idToDelete = book1.getId();
        boolean result = database.delete(idToDelete);

        assertTrue(result, "Книга с указанным id должна быть удалена");

        boolean deleteAgain = database.delete(book1);
        assertFalse(deleteAgain, "Книга уже удалена и не существует в базе");
    }


    @Test
    void testDeleteBookTrue() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        database.save(book1);
        database.save(book2);

        boolean result = database.delete(book1);

        assertTrue(result, "Книга найдена и должна быть удалена");

        boolean deleteAgain = database.delete(book1);
        assertFalse(deleteAgain, "Книга уже удалена и не существует в базе");
    }
}