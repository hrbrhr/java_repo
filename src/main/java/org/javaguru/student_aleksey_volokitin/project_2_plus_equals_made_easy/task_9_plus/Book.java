package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_9_plus;

import java.util.Objects;

class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() { return author; }
    public String getTitle()  { return title; }

    public void setAuthor(String author) { this.author = author; }
    public void setTitle(String title)   { this.title = title; }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(author, book.author)
            && Objects.equals(title, book.title);
    }
}
