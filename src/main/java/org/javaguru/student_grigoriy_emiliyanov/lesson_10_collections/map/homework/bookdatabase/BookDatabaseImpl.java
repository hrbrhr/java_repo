package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework.bookdatabase;

import java.util.*;
import java.util.stream.Collectors;

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
    public List<Book> find(SearchCriteria searchCriteria) {
        return books.stream()
                .filter(searchCriteria::match)
                .toList();
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<String> findUniqueTitles() {
        return books.stream()
                .map(Book::getTitle)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Set<String> find(String text) {
        return Set.of();
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return Map.of();
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        return Map.of();
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
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
