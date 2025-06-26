package org.javaguru.student_elena_tiutiunnikova.project_2_equals_made_easy;

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

    public int getPageCount() { return pageCount; }

    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    // Это дефолтная реализация метода equals() из класса Object
    //    @Override
    //    public boolean equals(Object obj) {
    //        return (this == obj);
    //    }

    //    реализация синтаксиса instanceof, начиная с Java 16+
    //    @Override
    //    public final boolean equals(Object o) {
    //        if (this == o) return true;
    //        if (!(o instanceof Book book)) return false;
    //
    //        return Objects.equals(author, book.author)
    //                && Objects.equals(title, book.title);
    //    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return
                pageCount == book.pageCount
                        && Objects.equals(author, book.author)
                        && Objects.equals(title, book.title);
    }

}
