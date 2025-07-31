package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.list.lessoncode;

import java.util.List;

class BookLibraryTest {
    public static void main(String[] args) {
        BookLibraryTest testSuite = new BookLibraryTest();
        testSuite.shouldReturnNumberOfBooks();
        testSuite.shouldFindBookByTitle();
        testSuite.shouldFindBookByAuthor();
        testSuite.shouldFindTotalPages();
        testSuite.shouldFindTotalPagesByAuthor();
        testSuite.shouldRemoveBook();
    }

    private void shouldRemoveBook() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.add(new Book("Defoe", "Robinson", 123));
        bookLibrary.add(new Book("Leo", "War and Peace", 321));
        bookLibrary.add(new Book("Jules", "20000 under", 543));
        bookLibrary.add(new Book("Leo", "Anna Karenina", 1000));
        bookLibrary.removeBook("Leo", "War and Peace", 321);
        checkExpect(3, bookLibrary.getNumberOfBooks(), "test remove");
    }

    private void shouldFindTotalPagesByAuthor() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.add(new Book("Defoe", "Robinson", 123));
        bookLibrary.add(new Book("Leo", "War and Peace", 321));
        bookLibrary.add(new Book("Jules", "20000 under", 543));
        bookLibrary.add(new Book("Leo", "Anna Karenina", 1000));
        int expected = 321 + 1000;
        checkExpect(expected, bookLibrary.findTotalPagesByAuthor("Leo"), "test find total pages by author");
    }

    private void shouldFindBookByAuthor() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.add(new Book("Defoe", "Robinson", 123));
        bookLibrary.add(new Book("Leo", "War and Peace", 321));
        bookLibrary.add(new Book("Jules", "20000 under", 543));
        List<Book> expected = List.of(new Book("Jules", "20000 under", 543));
        checkExpect(expected, bookLibrary.findBooksByAuthor("Jules"), "test find books by author");
    }

    private void shouldFindTotalPages() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.add(new Book("Defoe", "Robinson", 123));
        bookLibrary.add(new Book("Leo", "War and Peace", 321));
        bookLibrary.add(new Book("Jules", "20000 under", 543));
        int expected = 123 + 321 + 543;
        checkExpect(expected, bookLibrary.findTotalPages(), "test find total pages");
    }

    private void shouldFindBookByTitle() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.add(new Book("Defoe", "Robinson", 123));
        bookLibrary.add(new Book("Leo", "War and Peace", 321));
        bookLibrary.add(new Book("Jules", "20000 under", 543));
        List<Book> expected = List.of(new Book("Leo", "War and Peace", 321));
        checkExpect(expected, bookLibrary.findBooksByTitle("War and Peace"), "test find book by title");
    }

    public void shouldReturnNumberOfBooks() {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.add(new Book("Defoe", "Robinson", 123));
        bookLibrary.add(new Book("Leo", "War and Peace", 123));
        bookLibrary.add(new Book("Jules", "20000 under", 123));
        checkExpect(3, bookLibrary.getNumberOfBooks(), "test number of books");
    }

    private void checkExpect(int expected, int real, String testCaseName) {
        if (real == expected) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }

    private void checkExpect(Book expected, Book real, String testCaseName) {
        if (real.equals(expected)) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }

    private void checkExpect(List<Book> expected, List<Book> real, String testCaseName) {
        if (real.equals(expected)) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
    private void checkExpect(String expected, String real, String testCaseName) {
        if (real.equals(expected)) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
}
