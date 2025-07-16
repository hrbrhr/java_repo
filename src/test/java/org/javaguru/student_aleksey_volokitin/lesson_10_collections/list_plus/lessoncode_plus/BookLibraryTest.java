package org.javaguru.student_aleksey_volokitin.lesson_10_collections.list_plus.lessoncode_plus;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class BookLibraryTest {

    @Test
    void test1_findCountOfBooksWhenZeroBooks() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        assertEquals(0, library.findCountOfBooks());
    }

    @Test
    void test2_findCountOfBooks() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        library.addBook("Book1", "Author1", 1);
        library.addBook("Book2", "Author3", 2);
        library.addBook("Book3", "Author3", 3);

        assertEquals(3, library.findCountOfBooks());
    }

    @Test
    void test3_findBooksByTitleWhenZeroBooks() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        assertEquals(0, library.findBookByTitle("Book2").size());

    }

    @Test
    void test4_findBooksByTitle() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        library.addBook("Book1", "Author1", 1);
        library.addBook("Book2", "Author3", 2);
        library.addBook("Book3", "Author3", 3);
        library.addBook("Book2", "Author4", 4);

        assertEquals(1, library.findBookByTitle("Book1").size());
        assertEquals(2, library.findBookByTitle("Book2").size());
        assertEquals(1, library.findBookByTitle("Book3").size());
        assertEquals(0, library.findBookByTitle("Book").size());
    }

    @Test
    void test5_findBooksByAuthorWhenZeroBooks() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        assertEquals(0, library.findBookByAuthor("Author1").size());
    }

    @Test
    void test6_findBooksByAuthor() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        library.addBook("Book1", "Author1", 1);
        library.addBook("Book2", "Author3", 2);
        library.addBook("Book3", "Author3", 3);
        library.addBook("Book4", "Author4", 4);

        assertEquals(1, library.findBookByAuthor("Author1").size());
        assertEquals(0, library.findBookByAuthor("Author2").size());
        assertEquals(2, library.findBookByAuthor("Author3").size());
        assertEquals(1, library.findBookByAuthor("Author4").size());
    }

    @Test
    void test7_findCountOfAllPagesInBooksByAuthorWhenZeroBooks() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        assertEquals(0, library.findCountOfAllPagesInBooksByAuthor("Author1"));
    }

    @Test
    void test8_findCountOfAllPagesInBooksByAuthor() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        library.addBook("Book1", "Author1", 1);
        library.addBook("Book2", "Author3", 267);
        library.addBook("Book3", "Author3", 311);
        library.addBook("Book4", "Author4", 4);

        assertEquals(1, library.findCountOfAllPagesInBooksByAuthor("Author1"));
        assertEquals(0, library.findCountOfAllPagesInBooksByAuthor("Author2"));
        assertEquals(578, library.findCountOfAllPagesInBooksByAuthor("Author3"));
        assertEquals(4, library.findCountOfAllPagesInBooksByAuthor("Author4"));
    }

    @Test
    void test9_removeBookByCriteriaWhenZeroBooks() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        library.removeBookByCriteria("Book1", "Author1");

        assertEquals(0, books.size());
    }

    @Test
    void test10_removeBookByCriteria() {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);

        library.addBook("Book1", "Author1", 1);
        library.addBook("Book2", "Author3", 267);
        library.addBook("Book2", "Author3", 267);
        library.addBook("Book3", "Author3", 311);
        library.addBook("Book4", "Author4", 4);

        library.removeBookByCriteria("Book1", "Author1");
        assertEquals(4, books.size());

        library.addBook("Book1", "Author1", 1);
        assertEquals(5, books.size());

        library.removeBookByCriteria("Book2", "Author3");
        assertEquals(3, books.size());

        library.addBook("Book2", "Author3", 267);
        library.addBook("Book2", "Author3", 267);
        assertEquals(5, books.size());

        library.removeBookByCriteria("Book3", "Author3");
        assertEquals(4, books.size());

        library.addBook("Book3", "Author3", 311);
        assertEquals(5, books.size());

        library.removeBookByCriteria("Book4", "Author4");
        assertEquals(4, books.size());

        library.addBook("Book4", "Author4", 4);
        assertEquals(5, books.size());

        library.removeBookByCriteria("Book999", "Author999");
        assertEquals(5, books.size());

        library.removeBookByCriteria("Book2", "Author3");
        assertEquals(3, books.size());
    }
}