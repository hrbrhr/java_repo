package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_3;

public class BookApp {
    public static void main(String[] args) {
        Book bookOne = new Book("Great Book", "Great Author", 1993);
        Book bookTwo = new Book("Greater Book", "Greater Author", 1995);

        bookOne.makeChapter(bookOne.getChapterOne(), "Book One Chapter One", "text in chapter one");
        bookOne.makeChapter(bookOne.getChapterTwo(), "Book One Chapter Two", "text in chapter two");
        bookTwo.makeChapter(bookTwo.getChapterOne(), "Book Two Chapter One", "text in chapter one");
        bookTwo.makeChapter(bookTwo.getChapterTwo(), "Book Two Chapter Two", "text in chapter two");

        System.out.println(bookOne.getName());
        System.out.println(bookOne.getAuthor());
        System.out.println(bookOne.getYearOfIssue());
        System.out.println(bookOne.getChapterOne());
        System.out.println(bookOne.getChapterTwo());
        System.out.println();
        System.out.println(bookTwo.getName());
        System.out.println(bookTwo.getAuthor());
        System.out.println(bookTwo.getYearOfIssue());
        System.out.println(bookTwo.getChapterOne());
        System.out.println(bookTwo.getChapterTwo());
    }
}
