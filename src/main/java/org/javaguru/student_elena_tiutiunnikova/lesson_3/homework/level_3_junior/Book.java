package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_3_junior;

class Book {
    private String name;
    private String author;
    private int year;
    private String chapter1;
    private String chapter2;

        public Book (String name, String author, int year, String chapter1, String chapter2) {
            this.name = name;
            this.author = author;
            this.year = year;
            this.chapter1 = chapter1;
            this.chapter2 = chapter2;
        }

        public String getName() {return name;}
        public String getAuthor() {return author;}
        public int getYear() {return year;}
        public String getChapter1() {return chapter1;}
        public String getChapter2() {return chapter2;}

}
