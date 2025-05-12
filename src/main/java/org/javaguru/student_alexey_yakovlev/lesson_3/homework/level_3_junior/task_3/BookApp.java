package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_3_junior.task_3;

class BookApp {

    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Глава 1", "Текст");
        Chapter chapter2 = new Chapter("Глава 2", "Текст");
        Book book1 = new Book("Том Сойер", "Марк Твен", 1876, chapter1, chapter2);

        System.out.println("Title: " + book1.getTitle() + ",\n" + "Author: " + book1.getAuthor() + ",\n" +
                "DateOfPublication: " + book1.getYearOfIssue() + ",\n" + "TitleChapter1: " + chapter1.getTitle() + ",\n" +
                "TextChapter1: " + chapter1.getText() + ",\n" + "TitleChapter2: " + chapter2.getTitle() + ",\n" +
                "TextChapter2: " + chapter2.getText());

        chapter1 = new Chapter("Глава 1", "Текст");
        chapter2 = new Chapter("Глава 2", "Текст");
        Book book2 = new Book("Путешествие к центру Земли", "Жюль Верн", 1864, chapter1, chapter2);

        System.out.println("\nTitle: " + book2.getTitle() + ",\n" + "Author: " + book2.getAuthor() + ",\n" +
                "DateOfPublication: " + book2.getYearOfIssue() + ",\n" + "TitleChapter1: " + chapter1.getTitle() + ",\n" +
                "TextChapter1: " + chapter1.getText() + ",\n" + "TitleChapter2: " + chapter2.getTitle() + ",\n" +
                "TextChapter2: " + chapter2.getText());
    }
}
