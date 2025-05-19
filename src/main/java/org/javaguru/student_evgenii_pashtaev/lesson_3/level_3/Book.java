package org.javaguru.student_evgenii_pashtaev.lesson_3.level_3;

class Book {

    private String name;
    String author;
    private int since;
    private final ChapterOne chapterOne;
    private final ChapterTwo chapterTwo;

    Book(String name, String author, int since, ChapterOne chapterOne, ChapterTwo chapterTwo) {
        this.name = name;
        this.author = author;
        this.since = since;
        this.chapterOne = new ChapterOne(chapterOne.chapterOneName, chapterOne.textOne);
        this.chapterTwo = new ChapterTwo(chapterTwo.chapterTwoName, chapterTwo.textTwo);
    }

    public String getName(){
        return this.name;

    }

    public String getAuthor(){
        return this.author;  
    }

    public int getSince(){
        return this.since;
    }

    public String getChapterOneName(){
        return chapterOne.chapterOneName;
    }

    public String getTextOne(){
        return chapterOne.textOne;
    }

    public String getChapterTwoName(){
        return chapterTwo.chapterTwoName;
    }
    public String getTextTwo(){
        return chapterTwo.textTwo;
    }
}
