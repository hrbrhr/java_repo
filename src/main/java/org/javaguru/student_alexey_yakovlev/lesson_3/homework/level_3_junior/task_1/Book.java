package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_3_junior.task_1;

class Book {

    private String name;
    private String author;
    private int yearOfIssue;
    private ChapterOne chapterOne;
    private ChapterTwo chapterTwo;

    public Book(String name, String author, int yearOfIssue, ChapterOne chapterOne, ChapterTwo chapterTwo) {
        this.name = name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        this.chapterOne = chapterOne;
        this.chapterTwo = chapterTwo;
    }
}
