package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

//    Создайте класс BookDatabaseImpl, который реализует интерфейс BookDatabase.
//    Реализуйте в нём метод  Long save(Book book). Книги внутри класса BookDatabaseImpl
//    храните в списке.

    private List <Book> books = new ArrayList<>();
    private Long currentBookID = 1L;

    @Override
    public Long save(Book book) {
    book.setId(currentBookID);
    books.add(book);
    return currentBookID++;
    }

    @Override
    public boolean delete(Long bookId) {
       return books.removeIf(book -> book.getId().equals(bookId));
    };

    @Override
    public boolean delete(Book book) {
        return books.remove(book);
    };

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book: books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>(); //Отдельный список нужен, т.к. может быть несколько книг от одного автора
        for (Book book: books) {
            if (book.getAuthor().equals(author)) {
                result.add(book); //Если автор совпадает, мы добавляем эту книгу в новый список result
            }
        }
        return result; //После цикла возвращаем этот список.
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book: books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public  List<Book> find(SearchCriteria searchCriteria) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                result.add(book);
            }
        }
        return result;
    }

}
