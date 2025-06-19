package org.javaguru.student_elena_tiutiunnikova.lesson_8.lessoncode;

class SchoolDairyApp {
    public static void main(String[] args) {
        SchoolDairy businessLogic = new SchoolDairy();
        SchoolDairyUI userInterface = new SchoolDairyUI(businessLogic);

        userInterface.start();
    }
}
