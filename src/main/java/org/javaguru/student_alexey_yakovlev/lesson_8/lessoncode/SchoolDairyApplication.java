package org.javaguru.student_alexey_yakovlev.lesson_8.lessoncode;

class SchoolDairyApplication {

    public static void main(String[] args) {
     SchoolDairy schoolDairy = new SchoolDairy();
     SchoolDairyUI schoolDairyUI = new SchoolDairyUI(schoolDairy);

     schoolDairyUI.start();
    }
}
