package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_5_plus.task_1;

class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
