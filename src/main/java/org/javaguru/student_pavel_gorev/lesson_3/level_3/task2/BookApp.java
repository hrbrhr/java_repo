package org.javaguru.student_pavel_gorev.lesson_3.level_3.task2;

class BookApp {
    public static void main(String[] args) {
        // Книга 1
        Chapter book1Chapter1 = new Chapter("Введение", "Это введение в Java.");
        Chapter book1Chapter2 = new Chapter("Переменные", "Подробно о переменных.");
        Book book1 = new Book("Изучаем Java", "Иван Иванов", 2023, book1Chapter1, book1Chapter2);

        // Книга 2
        Chapter book2Chapter1 = new Chapter("Начало", "Как начать с Python.");
        Chapter book2Chapter2 = new Chapter("Циклы", "Работа с циклами.");
        Book book2 = new Book("Python для начинающих", "Анна Смирнова", 2022, book2Chapter1, book2Chapter2);
    }
}