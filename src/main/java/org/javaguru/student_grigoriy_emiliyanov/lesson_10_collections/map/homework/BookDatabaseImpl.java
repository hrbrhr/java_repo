package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {
    List<Book> books = new ArrayList<>();
    private Long id = 1L;

    @Override
    public Long save(Book book) {
        book.setId(id);
        books.add(book);
        return id++;
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(bookId)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> booksToDelete = findByAuthor(author);
        for (Book book : booksToDelete) {
            delete(book);
        }
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.ofNullable(null);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }
}
