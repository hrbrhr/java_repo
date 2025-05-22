package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_3;

 class BookApp {

     public static void main(String[] args) {

         Chapter chapter1 = new Chapter("Harry Potter and the Philosopher's Stone","text");
         Chapter chapter2 = new Chapter("Harry Potter and the Chamber of Secrets","t-e-x-t");

         Book book1 = new Book("Harry Potter ","J.K.Rowling ",1997, chapter1,chapter2);

         System.out.println("Book title = " + book1.getTitle());
         System.out.println("Book author = " + book1.getAuthor());
         System.out.println("Book year_of_publication = " + book1.getYear_of_publication());
         System.out.println("chapter 1 title = " + book1.getChapter1().getTitle());
         System.out.println("chapter 1 text = " + book1.getChapter1().getText());
         System.out.println("chapter 2 title = " + book1.getChapter2().getTitle());
         System.out.println("chapter 2 text = " + book1.getChapter2().getText());

         chapter1 = new Chapter("The Fellowship of the Ring ", " blablabla");
         chapter2 = new Chapter("The Two Towers","bla-bla-bla");

         Book book2 = new Book("The Lord of the Rings ","J. R. R. Tolkien. ",1968,chapter1,chapter2);

         System.out.println("Book title = " + book2.getTitle());
         System.out.println("Book author = " + book2.getAuthor());
         System.out.println("Book year_of_publication = " + book2.getYear_of_publication());
         System.out.println("chapter 1 title = " + book2.getChapter1().getTitle());
         System.out.println("chapter 1 text = " + book2.getChapter1().getText());
         System.out.println("chapter 2 title = " + book2.getChapter2().getTitle());
         System.out.println("chapter 2 text = " + book2.getChapter2().getText());

     }


}
