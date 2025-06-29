package org.javaguru.student_aleksey_volokitin.project_2_plus_equals_made_easy.task_1_8_plus;

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

    // Это дефолтная реализация метода equals() из класса Object
    @Override
    public boolean equals(Object obj) { return (this == obj); }
}
