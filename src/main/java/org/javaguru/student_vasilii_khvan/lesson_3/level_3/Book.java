package org.javaguru.student_vasilii_khvan.lesson_3.level_3;

public class Book {

    private String title;
    private String author;
    private int year;
    private Chapter chapterOne;
    private Chapter chapterTwo;

    Book(String title, String author, int year, Chapter chapterOne, Chapter chapterTwo) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.chapterOne = chapterOne;
        this.chapterTwo = chapterTwo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Chapter getChapterOne() {
        return chapterOne;
    }

    public Chapter getChapterTwo() {
        return chapterTwo;
    }
}
