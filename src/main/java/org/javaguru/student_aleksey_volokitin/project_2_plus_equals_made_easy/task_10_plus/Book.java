package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_10_plus;

import java.util.Objects;

class Book {

    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getAuthor() { return author; }
    public String getTitle()  { return title; }
    public int getPageCount() { return pageCount; }

    public void setAuthor(String author)    { this.author = author; }
    public void setTitle(String title)      { this.title = title; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return pageCount == book.pageCount
                && Objects.equals(author, book.author)
                && Objects.equals(title, book.title);
    }
}
