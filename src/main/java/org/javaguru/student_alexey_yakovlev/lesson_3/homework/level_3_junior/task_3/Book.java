package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_3_junior.task_3;

class Book {

    private String name;
    private String author;
    private int yearOfIssue;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String name, String author, int yearOfIssue, Chapter chapter1, Chapter chapter2) {
        this.name = name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}
