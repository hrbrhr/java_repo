package org.javaguru.student_evgenii_pashtaev.lesson_3.level_3;

public class BookApp {

    public static void main(String[] args) {

        Book bookOne = new Book("Six", "Ivanov", 1546, new ChapterOne("ChapterOne","Walking dog"), new ChapterTwo("ChapterTwo", "Flying bird"));
        Book bookTwo = new Book("Seven", "Makina", 2009, new ChapterOne("First chapter", "Seven kingdoms"), new ChapterTwo("Second chapter","Drive car"));

        System.out.println(bookOne.getAuthor() + " " + bookOne.getName() + " " + bookOne.getSince());
        System.out.println(bookTwo.getAuthor() + " " + bookTwo.getName() + " " + bookTwo.getSince());

        System.out.println(bookOne.getChapterOneName() + " " + bookOne.getTextOne());
        System.out.println(bookOne.getChapterTwoName() + " " + bookOne.getTextTwo());

        System.out.println(bookTwo.getChapterOneName() + " " + bookTwo.getTextOne());
        System.out.println(bookTwo.getChapterTwoName() + " " + bookTwo.getTextTwo());


    }
}
