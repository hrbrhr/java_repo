package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_3_junior.task_2;

class BookApp {

    public static void main(String[] args) {

        Chapter chapter1 = new Chapter("TomPlayFightHide", "textChapter");
        Chapter chapter2 = new Chapter("GreatHousePainter", "textChapter");
        Book book1 = new Book("TomSawyer", "MarkTwain", 1876, chapter1, chapter2);

        chapter1 = new Chapter("ProfessorAndFamily", "textChapter");
        chapter2 = new Chapter("MysteryMustBeSolved", "textChapter");
        Book book2 = new Book("JourneyToCenterOfEarth", "JulesVerne", 1864, chapter1, chapter2);
    }
}
