package org.javaguru.student_evgenii_pashtaev.lesson_8.lessoncode;

public class SchoolDairyApplication {

    public static void main(String[] args) {

        SchoolDairy businessLogic = new SchoolDairy();
        SchoolDairyUI ui = new SchoolDairyUI(businessLogic);

        ui.start();
    }

}

