package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_3_junior.task_3;

class BookApp {

    public static void main(String[] args) {

        Chapter chapter1 = new Chapter("TomPlayFightHide", "textChapter");
        Chapter chapter2 = new Chapter("GreatHousePainter", "textChapter");
        Book book1 = new Book("TomSawyer", "MarkTwain", 1876, chapter1, chapter2);

        chapter1 = new Chapter("ProfessorAndFamily", "textChapter");
        chapter2 = new Chapter("MysteryMustBeSolved", "textChapter");
        Book book2 = new Book("JourneyToCenterOfEarth", "JulesVerne", 1864, chapter1, chapter2);


        System.out.println("Info book1: \n" + "TitleOfBook = " + book1.getName() + ",\n" + "Author = " + book1.getAuthor() +
                ",\n" + "DateOfPublication = " + book1.getYearOfIssue() + ",\n" + "TitleChapter1 = " + chapter1.getTitle() +
                ",\n" + "TextChapter1 = " + chapter1.getText() + ",\n" + "TitleChapter2 = " + chapter2.getTitle() +
                ",\n" + "TextChapter1 = " + chapter1.getText() + "\n");

        System.out.println("Info book2: \n" + "TitleOfBook = " + book2.getName() + ",\n" + "Author = " + book2.getAuthor() +
                ",\n" + "DateOfPublication = " + book2.getYearOfIssue() + ",\n" + "TitleChapter1 = " + chapter1.getTitle() +
                ",\n" + "TextChapter1 = " + chapter1.getText() + ",\n" + "TitleChapter2 = " + chapter2.getTitle() +
                ", \n" + "TextChapter1 = " + chapter1.getText());

    }
}
