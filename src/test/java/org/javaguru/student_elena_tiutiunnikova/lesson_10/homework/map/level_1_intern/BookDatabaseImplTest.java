package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {


    @Test
    void testDeleteIDTrue() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
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
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
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
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        database.save(book1);
        database.save(book2);

        Optional<Book> result = database.findById(1L);
        assertEquals(Optional.of(book1), result);
    }

    @Test
    void testOptionalFailedSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        database.save(book1);
        database.save(book2);

        Optional<Book> result = database.findById(1000L);
        assertEquals(Optional.empty(), result);
    }

    @Test
    void testFindAuthorSuccessfulSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
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
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
        database.save(book1);
        database.save(book2);
        database.save(book3);

        List<Book> result = database.findByAuthor("Lermontov");
        assertTrue(result.isEmpty());
    }

    @Test
    void testFindTitleSuccessfulSearch() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor", "1998");
        Book book5 = new Book("Waters", "Nochnoy dozor", "2006");
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
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor", "1998");
        Book book5 = new Book("Waters", "Nochnoy dozor", "2006");
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
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        database.save(book1);
        database.save(book2);

        int result = database.countAllBooks();
        assertEquals(2, result);
    }

    @Test
    void testDeleteByAuthorSuccessful () {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor", "1998");
        Book book5 = new Book("Waters", "Nochnoy dozor", "2006");
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
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor", "1998");
        Book book5 = new Book("Waters", "Nochnoy dozor", "2006");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);

        database.deleteByAuthor("Lermontov");
        assertEquals(5, database.countAllBooks());
    }

    @Test
    void testDeleteByTitleSuccessful () {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor", "1998");
        Book book5 = new Book("Waters", "Nochnoy dozor", "2006");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);

        database.deleteByTitle("Nochnoy dozor");
        assertEquals(3, database.countAllBooks());
    }

    @Test
    void testDeleteByTitleFailed () {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Pushkin", "Ruslan y Lyudmila", "1820");
        Book book2 = new Book("Bulgakov", "Master y Margarita", "1967");
        Book book3 = new Book("Pushkin", "Dubrovsky", "1833");
        Book book4 = new Book("Lukianenko", "Nochnoy dozor", "1998");
        Book book5 = new Book("Waters", "Nochnoy dozor", "2006");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);

        database.deleteByTitle("Bible");
        assertEquals(5, database.countAllBooks());
    }

    @Test
    void testSearchCriteriaAuthorAndTitleSuccessful () {
        BookDatabase database = SearchCriteriaDemo.bookDatabase();
        SearchCriteria searchAuthorAndTitle = SearchCriteriaDemo.searchCriteriaTitleAndAuthor("Pushkin", "Dubrovsky");
        List<Book> result = database.find(searchAuthorAndTitle);

        assertEquals(1, result.size());
        assertEquals("Pushkin", result.get(0).getAuthor());
        assertEquals("Dubrovsky", result.get(0).getTitle());
    }

    @Test
    void testSearchCriteriaAuthorAndYearSuccessful () {
        BookDatabase database = SearchCriteriaDemo.bookDatabase();
        SearchCriteria searchAuthorAndYear = SearchCriteriaDemo.searchCriteriaYearAndAuthor("Pushkin", "1820");
        List<Book> result = database.find(searchAuthorAndYear);

        assertEquals(1, result.size());
        assertEquals("Pushkin", result.get(0).getAuthor());
        assertEquals("1820", result.get(0).getYearOfIssue());
    }

    @Test
    void testSearchCriteriaOrSuccessful () {
        BookDatabase database = SearchCriteriaDemo.bookDatabase();
        SearchCriteria searchOr = SearchCriteriaDemo.searchCriteriaOr("Pushkin", "Nochnoy dozor", "1967");
        List<Book> result = database.find(searchOr);

        assertEquals(5, result.size());
      }

    @Test
    void testSearchCriteriaOrFailed () {
        BookDatabase database = SearchCriteriaDemo.bookDatabase();
        SearchCriteria searchOr = SearchCriteriaDemo.searchCriteriaOr("Lermontov", "Bible", "2025");
        List<Book> result = database.find(searchOr);

        assertEquals(0, result.size());
    }

    @Test
    void testFindUniqueAuthors () {
        BookDatabase database = SearchCriteriaDemo.bookDatabase();
        Set<String> uniqueAuthors = database.findUniqueAuthors();

        assertEquals(4, uniqueAuthors.size());
        assertTrue(uniqueAuthors.contains("Pushkin"));
        assertTrue(uniqueAuthors.contains("Bulgakov"));
        assertTrue(uniqueAuthors.contains("Lukianenko"));
        assertTrue(uniqueAuthors.contains("Waters"));
    }

}