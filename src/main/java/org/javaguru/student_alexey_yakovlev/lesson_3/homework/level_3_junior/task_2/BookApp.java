package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_3_junior.task_2;

class BookApp {

    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Глава 1", "Текст");
        Chapter chapter2 = new Chapter("Глава 2", "Текст");
        Book book1 = new Book("Том Сойер", "Марк Твен", 1876, chapter1, chapter2);

        chapter1 = new Chapter("Глава 1", "Текст");
        chapter2 = new Chapter("Глава 2", "Текст");
        Book book2 = new Book("Путешествие к центру Земли", "Жюль Верн", 1864, chapter1, chapter2);


    }
}
