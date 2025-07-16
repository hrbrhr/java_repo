package org.javaguru.student_aleksey_volokitin.lesson_10_collections.list.lessoncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookLibraryApp {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        BookLibrary library = new BookLibrary(books);
        library.addBook("Book1", "Author1", 1);
        library.addBook("Book2", "Author3", 2);
        library.addBook("Book2", "Author3", 2);
        library.addBook("Book3", "Author3", 3);
        library.addBook("Book2", "Author4", 4);

        System.out.println(library);

        List<Book> booksByTitle = library.findBookByTitle("Book2");
        System.out.println(booksByTitle);

        String author = "Author";
        System.out.println("Count of pages " + author + ": " + library.findCountOfAllPagesInBooksByAuthor(author));

        library.removeBookByCriteria("Book2", "Author3");
        System.out.println(library);
    }
}
