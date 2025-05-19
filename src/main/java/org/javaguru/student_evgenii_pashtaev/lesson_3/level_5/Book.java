package org.javaguru.student_evgenii_pashtaev.lesson_3.level_5;
/*Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Book.
*/
class Book1 {

    private String title;

    Book1(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book1 myBook = new Book1("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}