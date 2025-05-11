package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_3_plus;

class BookChapter {
    private String title;
    private String text;

    BookChapter(String title,
                String text) {

        this.title = title;
        this.text = text;
    }

    String getTitle() {return title;}
    String getText()  {return text;}
}
