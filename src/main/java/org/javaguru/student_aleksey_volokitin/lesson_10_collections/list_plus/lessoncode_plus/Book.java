package org.javaguru.student_aleksey_volokitin.lesson_10_collections.list_plus.lessoncode_plus;

class Book {
    private String title;
    private String author;
    private int countOfPage;

    public Book(String title, String author, int countOfPage) {
        this.title = title;
        this.author = author;
        this.countOfPage = countOfPage;
    }

    public String getTitle()    { return title; }
    public String getAuthor()   { return author; }
    public int getCountOfPage() { return countOfPage; }

    public void setTitle(String newTitle)          { this.title = newTitle; }
    public void setAuthor(String newAuthor)        { this.author = newAuthor; }
    public void setCountOfPage(int newCountOfPage) { this.countOfPage = newCountOfPage; }

    @Override
    public String toString() {
        return  "Title: " + title +
                ", author: " + author +
                ", count of pages: " + countOfPage;
    }
}
