package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.map.homework.bookdatabase;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest testSuite = new BookDatabaseImplTest();
        testSuite.testSave();
        testSuite.testCountAll();
        testSuite.testFindById();
        testSuite.testFindByAuthor();
        testSuite.testFindByTitle();
        testSuite.testRemoveIndex();
        testSuite.testRemoveBook();
    }

    private void testSave() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book robinson = new Book("Defoe", "Robinson", "2017");
        Book karenina = new Book("Leo", "Anna Karenina", "2010");
        Book nemo = new Book("Verne", "Capitan Nemo", "2002");
        checkExpect(1L, database.save(robinson), "Test add robinson");
        checkExpect(2L, database.save(karenina), "Test add karenina");
        checkExpect(3L, database.save(nemo), "Test add nemo");
    }

    private void testCountAll() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book robinson = new Book("Defoe", "Robinson", "2017");
        Book karenina = new Book("Leo", "Anna Karenina", "2010");
        Book nemo = new Book("Verne", "Capitan Nemo", "2002");
        checkExpect(0, database.countAllBooks(), "Test count all");
        database.save(robinson);
        database.save(karenina);
        database.save(nemo);
        checkExpect(3, database.countAllBooks(), "Test count all");
    }

    private void testFindById() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book robinson = new Book("Defoe", "Robinson", "2017");
        Book karenina = new Book("Leo", "Anna Karenina", "2010");
        Book nemo = new Book("Verne", "Capitan Nemo", "2002");
        checkExpect(Optional.ofNullable(null), database.findById(2L), "Test find by id");
        database.save(robinson);
        database.save(karenina);
        database.save(nemo);
        checkExpect(karenina, database.findById(2L), "Test find by id");
    }

    private void testFindByAuthor() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book robinson = new Book("Defoe", "Robinson", "2017");
        Book karenina = new Book("Leo", "Anna Karenina", "2010");
        Book nemo = new Book("Verne", "Capitan Nemo", "2002");
        database.save(robinson);
        database.save(karenina);
        database.save(nemo);
        checkExpect(List.of(robinson), database.findByAuthor("Defoe"), "Test find by author");
    }
    private void testFindByTitle() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book robinson = new Book("Defoe", "Robinson", "2017");
        Book karenina = new Book("Leo", "Anna Karenina", "2010");
        Book nemo = new Book("Verne", "Capitan Nemo", "2002");
        database.save(robinson);
        database.save(karenina);
        database.save(nemo);
        checkExpect(List.of(nemo), database.findByTitle("Capitan Nemo"), "Test find by title");

    }
    private void testRemoveIndex() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book robinson = new Book("Defoe", "Robinson", "2017");
        Book karenina = new Book("Leo", "Anna Karenina", "2010");
        Book nemo = new Book("Verne", "Capitan Nemo", "2002");
        database.save(robinson);
        database.save(karenina);
        database.save(nemo);
        checkExpect(true, database.delete(2L), "Test remove nemo");
        checkExpect(2, database.countAllBooks(), "Test remove nemo count");
    }

    private void testRemoveBook() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book robinson = new Book("Defoe", "Robinson", "2017");
        Book karenina = new Book("Leo", "Anna Karenina", "2010");
        Book nemo = new Book("Verne", "Capitan Nemo", "2002");
        database.save(robinson);
        database.save(karenina);
        database.save(nemo);
        checkExpect(true, database.delete(nemo), "Test remove nemo");
        checkExpect(2, database.countAllBooks(), "Test remove nemo count");

    }

    private void checkExpect(Object expected, Object actual, String testCaseName) {
        if (Objects.equals(expected, actual)) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + actual);
        }
    }

    private void checkExpect(Book expected, Optional<Book> actual, String testCaseName) {
        if (actual.isPresent() && actual.get().equals(expected)) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + actual);
        }
    }
}
