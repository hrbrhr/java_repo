package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_3_plus;

class BookApp {
    public static void main(String[] args) {
        BookChapter book1chapter1 = new BookChapter("Том 1, часть 1, глава I",
                                                    "— Eh bien, mon prince.");
        BookChapter book1chapter2 = new BookChapter("Том 1, часть 1, глава II",
                                                    "Гостиная Анны Павловны начала понемногу наполняться");
        Book book1 = new Book("Война и мир",
                             "Л.Н. Толстой",
                               1869,
                                    book1chapter1,
                                    book1chapter2);

        BookChapter book2chapter1 = new BookChapter("Часть 1, глава I",
                                                    "В начале июля, в чрезвычайно жаркое время,");
        BookChapter book2chapter2 = new BookChapter("Часть 1, глава II",
                                                    "Раскольников не привык к толпе и, как уже сказано");
        Book book2 = new Book("Преступление и наказание",
                             "Ф.М. Достоевский",
                               1866,
                                    book2chapter1,
                                    book2chapter2);

        System.out.println("Variant № 1:");
        String output1 = book1.getName() + ", " +
                        book1.getAuthor() + ", " +
                        book1.getYear() + ", " +
                        "\n" +
                        book1chapter1.getTitle() + ": " +
                        book1chapter1.getText() +
                        "\n" +
                        book1chapter2.getTitle() + ": " +
                        book1chapter2.getText() +
                        "\n";
        String output2 = book2.getName() + ", " +
                book2.getAuthor() + ", " +
                book2.getYear() + ", " +
                "\n" +
                book2chapter1.getTitle() + ": " +
                book2chapter1.getText() +
                "\n" +
                book2chapter2.getTitle() + ": " +
                book2chapter2.getText() +
                "\n";

        System.out.println(output1);
        System.out.println(output2);

        System.out.println("Variant № 2:");
        book1.sOut();
        book2.sOut();
    }
}
