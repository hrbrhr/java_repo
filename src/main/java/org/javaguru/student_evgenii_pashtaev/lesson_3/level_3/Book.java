package org.javaguru.student_evgenii_pashtaev.lesson_3.level_3;

public class Book {

    String name;
    String author;
    int since;
    private final ChapterOne chapterOne;
    private final ChapterTwo chapterTwo;

    public Book(String name, String author, int since) {
        this.name = name;
        this.author = author;
        this.since = since;
        this.chapterOne = new ChapterOne("One", "Hello World !");
        this.chapterTwo = new ChapterTwo("Two", "By By World !");
    }

    public String getName(){
        return this.name + " " + chapterOne.getChapterOneName() + " " + chapterTwo.getChapterTwoName();

    }

    public String getAuthor(){
        return this.author;  
    }

    public int getSince(){
        return this.since;
    }

}
