package org.javaguru.student_aleksey_volokitin.lesson_10_collections.list_plus.lessoncode_plus;

import java.util.ArrayList;
import java.util.List;

class BookLibrary {
    private List<Book> books;


    public BookLibrary(List<Book> books) {
        this.books = books;
    }

    public void addBook(String title, String author, int countOfPage) {
        books.add(new Book(title, author, countOfPage));
    }

    public int findCountOfBooks() {
        return books.size();
    }

    public List<Book> findBookByTitle(String title) {
        List<Book> bookByTitle = new ArrayList<>();
        for (Book book: books) {
            if(book.getTitle().equals(title)) {
                bookByTitle.add(book);
            }
        }

        return bookByTitle;
    }

    public List<Book> findBookByAuthor(String author) {
        List<Book> bookByTitle = new ArrayList<>();
        for (Book book: books) {
            if(book.getAuthor().equals(author)) {
                bookByTitle.add(book);
            }
        }

        return bookByTitle;
    }

    public int findCountOfAllPagesInBooksByAuthor(String author) {
        int countOfPages = 0;
        for (Book book: books) {
            if(book.getAuthor().equals(author)) {
                countOfPages += book.getCountOfPage();
            }
        }

        return countOfPages;
    }

    public void removeBookByCriteria(String title, String author) {
       /* for (Book book: books) {
            if((book.getTitle().equals(title)) && (book.getAuthor().equals(author))) {
                books.remove(book);
            }
        }*/

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if((book.getTitle().equals(title)) && (book.getAuthor().equals(author))) {
                books.remove(book);
                i -= 1;
            }
        }
    }

    @Override
    public String toString() {
        String result = "Result: \n";
        for (Book book: books){
            result += book.toString() + "\n";
        }

        return result;
    }


}

