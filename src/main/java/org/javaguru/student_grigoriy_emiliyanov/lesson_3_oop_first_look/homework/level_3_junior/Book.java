package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.homework.level_3_junior;
public class Book {
    private String author;
    private String year;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String author, String year, Chapter chapter1, Chapter chapter2) {
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}
