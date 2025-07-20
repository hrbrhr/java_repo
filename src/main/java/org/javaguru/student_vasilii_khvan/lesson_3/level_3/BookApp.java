package org.javaguru.student_vasilii_khvan.lesson_3.level_3;

public class BookApp {

    public static void main(String[] args) {
        Chapter chapterOne = new Chapter("The Boy Who Lived", "Text of Chapter One");
        Chapter chapterTwo = new Chapter("The Vanishing Glass", "Text of Chapter Two");

        Book bookOne = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling",
                                    1997, chapterOne, chapterTwo);

        chapterOne.setTitle("The Worst Birthday");
        chapterOne.setText("Text of Chapter One");

        chapterTwo.setTitle("Dobby's Warning");
        chapterTwo.setText("Text of Chapter Two");

        Book bookTwo = new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling",
                                    1998, chapterOne, chapterTwo);

        System.out.println(bookOne.getTitle());
        System.out.println(bookOne.getAuthor());
        System.out.println(bookOne.getYear());
        System.out.println(bookOne.getChapterOne());
        System.out.println(bookOne.getChapterTwo());
    }
}
