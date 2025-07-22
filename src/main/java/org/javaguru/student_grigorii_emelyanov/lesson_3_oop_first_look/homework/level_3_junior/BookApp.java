package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.homework.level_3_junior;

public class BookApp {
    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Chapter 1", "This is chapter 1 text");
        Chapter chapter2 = new Chapter("Chapter 2", "This is chapter 2 text");
        Chapter chapter3 = new Chapter("Chapter 3", "This is chapter 3 text");
        Chapter chapter4 = new Chapter("Chapter 4", "This is chapter 4 text");

        Book book1 = new Book("Defoe", "1876", chapter1, chapter2);
        Book book2 = new Book("Twain", "1900", chapter3, chapter4);

        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());
        System.out.println("Chapter 1: " + book1.getChapter1());
        System.out.println("Chapter 2: " + book1.getChapter2());
        System.out.println();
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year: " + book2.getYear());
        System.out.println("Chapter 1: " + book2.getChapter1());
        System.out.println("Chapter 2: " + book2.getChapter2());
    }
}
