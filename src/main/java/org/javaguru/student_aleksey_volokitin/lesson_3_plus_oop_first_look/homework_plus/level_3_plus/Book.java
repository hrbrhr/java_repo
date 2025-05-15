package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_3_plus;

class Book {
    private String name;
    private String author;
    private int year;
    private BookChapter chapter1;
    private BookChapter chapter2;

    Book(String name,
         String author,
         int year,
         BookChapter chapter1,
         BookChapter chapter2) {

        this.name = name;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    String getName()          {return name;}
    String getAuthor()        {return author;}
    int getYear()             {return year;}

    void sOut() {
        String output = this.name + ", " +
                        this.author + ", " +
                        this.year + ",  " +
                        "\n" +
                        chapter1.getTitle() + ": " +
                        chapter1.getText() +
                        "\n" +
                        chapter2.getTitle() + ": " +
                        chapter2.getText() +
                        "\n";
        System.out.println(output);
    }
}
