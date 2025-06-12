package org.javaguru.student_pavel_gorev.lesson_3.level_3.task2;

class Book {
    private String title;
    private String author;
    private int year;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title, String author, int year, Chapter chapter1, Chapter chapter2) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }
}
