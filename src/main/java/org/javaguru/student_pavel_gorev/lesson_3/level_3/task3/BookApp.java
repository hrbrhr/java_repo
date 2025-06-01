package org.javaguru.student_pavel_gorev.lesson_3.level_3.task3;

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

        // Вывод информации о книге 1
        System.out.println("Книга 1:");
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor());
        System.out.println("Год: " + book1.getYear());
        System.out.println("Глава 1: " + book1.getChapter1().getTitle() + " — " + book1.getChapter1().getText());
        System.out.println("Глава 2: " + book1.getChapter2().getTitle() + " — " + book1.getChapter2().getText());

        System.out.println();

        // Вывод информации о книге 2
        System.out.println("Книга 2:");
        System.out.println("Название: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor());
        System.out.println("Год: " + book2.getYear());
        System.out.println("Глава 1: " + book2.getChapter1().getTitle() + " — " + book2.getChapter1().getText());
        System.out.println("Глава 2: " + book2.getChapter2().getTitle() + " — " + book2.getChapter2().getText());

    }
}