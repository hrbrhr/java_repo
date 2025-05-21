package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_3;

public class Book {

    private String title;
    private String author;
    private int year_of_publication;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title, String author, int year_of_publication, Chapter chapter1, Chapter chapter2){
        this.title = title;
        this.author = author;
        this.year_of_publication = year_of_publication;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear_of_publication() {
        return year_of_publication;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}
