package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_3;

public class BookApp {

    public static void main(String[] args) {

        Book book1 = new Book("Мастер и Маргарита", "Булгаков", 1967, "chapter1", "chapter2");
        Chapter chapter1 = new Chapter("Никогда не разговаривайте с неизвестными", "xxxx");
        Chapter chapter2 = new Chapter("Понтий Пилат","XXXX");

        Book book2 = new Book("Мертвые души", "Гоголь", 1842, "chapter1", "chapter2");
        Chapter Chapter1 = new Chapter("Уездный город NN", "yyyy");
        Chapter Chapter2 = new Chapter("Помещик Манилов","YYYY");


        System.out.println("Book title: " + book1.getName());
        System.out.println("Book author: " + book1.getAuthor());
        System.out.println("Book year:  " + book1.getYear());
        System.out.println("Name Chapter 1: " + chapter1.getName());
        System.out.println("Text Chapter 1: " + chapter1.getText());
        System.out.println("Name Chapter 2: " + chapter2.getName());
        System.out.println("Text Chapter 2: " + chapter2.getText());

        System.out.println("Book title: " + book2.getName());
        System.out.println("Book author: " + book2.getAuthor());
        System.out.println("Book year:  " + book2.getYear());
        System.out.println("Name Chapter 1: " + Chapter1.getName());
        System.out.println("Text Chapter 1: " + Chapter1.getText());
        System.out.println("Name Chapter 2: " + Chapter2.getName());
        System.out.println("Text Chapter 2: " + Chapter2.getText());

    }
}
