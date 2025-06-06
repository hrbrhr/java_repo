package org.javaguru.student_vitalii_lutsenko.lesson_3.classwork;

 class GradeCalculator {

     String calculateGrade(int mark) {
         String grade;

         if ((mark >= 90) && (mark <= 100)) {
             grade = ("A");
         } else if ((mark >= 80) && (mark <= 89)) {
             grade = ("B");
         } else if ((mark >= 70) && (mark <= 79)) {
             grade = ("C");
         } else if ((mark >= 60) && (mark <= 69)) {
             grade = ("D");
         } else if ((mark >= 0) && (mark <= 59)) {
             grade = ("F");
         } else {
             grade = "Invalid"; // на случай некорректной оценки

         }

         return grade;
     }
}
