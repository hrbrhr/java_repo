package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.list.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BookLibrary {

    private final List<Book> books = new ArrayList();

    public void add(Book book) {
        books.add(book);
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public List<Book> findBooksByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public int findTotalPages() {
        return books.stream()
                .mapToInt(Book::getNbrOfPages)
                .sum();
    }

    public List<Book> findBooksByAuthor(String author) {
       return books.stream()
               .filter(book -> book.getAuthor().equalsIgnoreCase(author))
               .collect(Collectors.toList());
    }

    public int findTotalPagesByAuthor(String author) {
        return findBooksByAuthor(author).stream()
                .mapToInt(Book::getNbrOfPages)
                .sum();
    }

    public void removeBook(String author, String title, int nbrOfPages) {
        books.remove(new Book(author, title, nbrOfPages));
    }
}
