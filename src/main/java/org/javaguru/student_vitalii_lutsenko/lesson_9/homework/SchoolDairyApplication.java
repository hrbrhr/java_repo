package org.javaguru.student_vitalii_lutsenko.lesson_9.homework;

class SchoolDairyApplication {

     public static void main(String[] args) {

         SchoolDairy businessLogic = new SchoolDairy();
         SchoolDairyUI ui = new SchoolDairyUI(businessLogic);

         ui.start();

     }


}
