package org.javaguru.student_evgenii_pashtaev.lesson_3.level_3;

public class BookApp {

    public static void main(String[] args) {
        Book bookOne = new Book("Six", "Ivanov", 1546);
        Book bookTwo = new Book("Seven", "Makina", 2009);

        System.out.println(bookOne.getAuthor() + " " +  bookOne.getName() + " " + bookOne.getSince());
        System.out.println(bookTwo.getAuthor() + " " +  bookTwo.getName() + " " + bookTwo.getSince());
    }
}
