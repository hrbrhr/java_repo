package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.*;

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
    }

    @Override
    public boolean delete(Book book) {
        return books.remove(book);
    }

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

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>(); // создаем пустое множество, которое будет хранить уникальные имена авторов
        for (Book book : books) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : books) {
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
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
    public Map<String, List<Book>> getAuthorToBooksMap() {
//        Данный метод должен возвращать мап в котором ключом является
//        автор, а значением список книг этого автора.

        Map<String, List<Book>> authorMap = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            authorMap.computeIfAbsent(author, key -> new ArrayList<>()).add(book);
        }
        return authorMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
//        Данный метод должен возвращать мап в котором ключом является
//        автор, а значением количество уникальных книг этого автора в базе данных.
        Map<String, Set<Book>> authorToUniqueBooks = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthor();
            authorToUniqueBooks.computeIfAbsent(author, key -> new HashSet<>()).add(book);
        }

        // Конечная мапа для хранения количества уникальных книг для каждого автора
        Map<String, Integer> authorToCount = new HashMap<>();
        for (Map.Entry<String, Set<Book>> entry : authorToUniqueBooks.entrySet()) {
            authorToCount.put(entry.getKey(), entry.getValue().size());
        }

        return authorToCount;
    }

}
