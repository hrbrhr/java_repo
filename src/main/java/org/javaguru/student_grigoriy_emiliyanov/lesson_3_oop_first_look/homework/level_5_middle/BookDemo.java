package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.homework.level_5_middle;

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
