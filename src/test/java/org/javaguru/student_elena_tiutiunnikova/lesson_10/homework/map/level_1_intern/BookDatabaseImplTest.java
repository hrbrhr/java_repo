package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

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

    @Test
    void testOptionalSuccessfulSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        database.save(book1);
        database.save(book2);

        Optional<Book> result = database.findById(1L);
        assertEquals(Optional.of(book1), result);
    }

    @Test
    void testOptionalFailedSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        database.save(book1);
        database.save(book2);

        Optional<Book> result = database.findById(1000L);
        assertEquals(Optional.empty(), result);
    }

    @Test
    void testFindAuthorSuccessfulSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        Book book3 = new Book("Pushkin", "Dubrovsky");
        database.save(book1);
        database.save(book2);
        database.save(book3);

        List<Book> result = database.findByAuthor("Pushkin");
        assertEquals(List.of(book1, book3), result);
//        assertEquals(2, result.size());
//        assertEquals(book1, result.get(0));
    }

    @Test
    void testFindAuthorFailedSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        Book book3 = new Book("Pushkin", "Dubrovsky");
        database.save(book1);
        database.save(book2);
        database.save(book3);

        List<Book> result = database.findByAuthor("Lermontov");
        assertTrue(result.isEmpty());
    }

    @Test
    void testFindTitleSuccessfulSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        Book book3 = new Book("Pushkin", "Dubrovsky");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor");
        Book book5 = new Book("Waters", "Nochnoy dozor");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);

        List<Book> result = database.findByTitle("Nochnoy dozor");
        assertEquals(List.of(book4, book5), result);
    }

    @Test
    void testFindTitleFailedSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        Book book3 = new Book("Pushkin", "Dubrovsky");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor");
        Book book5 = new Book("Waters", "Nochnoy dozor");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);

        List<Book> result = database.findByTitle("Bible");
        assertTrue(result.isEmpty());
    }

    @Test
    void testCountAllBooksSuccessful() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        database.save(book1);
        database.save(book2);

        int result = database.countAllBooks();
        assertEquals(2, result);
    }

    @Test
    void testDeleteByAuthorSuccessful () {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        Book book3 = new Book("Pushkin", "Dubrovsky");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor");
        Book book5 = new Book("Waters", "Nochnoy dozor");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);

        database.deleteByAuthor("Pushkin");
        assertEquals(3, database.countAllBooks());
    }

    @Test
    void testDeleteByAuthorFailed () {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila");
        Book book2 = new Book("Bulgakov", "Master y Margarita");
        Book book3 = new Book("Pushkin", "Dubrovsky");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor");
        Book book5 = new Book("Waters", "Nochnoy dozor");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);

        database.deleteByAuthor("Lermontov");
        assertEquals(5, database.countAllBooks());
    }


}