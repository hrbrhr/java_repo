package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.list.lessoncode;

import java.util.Objects;

class Book {
    private String author;
    private String title;
    private int nbrOfPages;

    public Book(String author, String title, int nbrOfPages) {
        this.author = author;
        this.title = title;
        this.nbrOfPages = nbrOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNbrOfPages() {
        return nbrOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return nbrOfPages == book.nbrOfPages && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, nbrOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", nbrOfPages=" + nbrOfPages +
                '}';
    }
}
