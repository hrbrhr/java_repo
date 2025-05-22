package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_5_middle.task_1;

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
