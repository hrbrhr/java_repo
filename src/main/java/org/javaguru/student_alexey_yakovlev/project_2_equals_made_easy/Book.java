package org.javaguru.student_alexey_yakovlev.project_2_equals_made_easy;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book book)) return false;

        return pageCount == book.pageCount
                && Objects.equals(author, book.author)
                && Objects.equals(title, book.title);
    }
}
