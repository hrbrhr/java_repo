package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_3;

class Book {
    private String name;
    private String author;
    private int yearOfIssue;
    private final Chapter chapterOne = new Chapter();
    private final Chapter chapterTwo = new Chapter();

    public Book(String name, String author, int yearOfIssue) {
        this.name = name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public void makeChapter(Chapter chapter, String name, String text) {
        chapter.setName(name);
        chapter.setText(text);
    }

    public Chapter getChapterOne() {
        return chapterOne;
    }

    public Chapter getChapterTwo() {
        return chapterTwo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
