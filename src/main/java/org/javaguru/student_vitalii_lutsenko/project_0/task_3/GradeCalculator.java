package org.javaguru.student_vitalii_lutsenko.project_0.task_3;

 class GradeCalculator {

      String calculateGrade(int mark) {

        String grade ;
       if ((mark >= 90) && (mark <= 100)) {
        grade = ("A");
       } else if ((mark >= 80) && (mark <= 89)) {
        grade = ("J");
       } else if ((mark >= 70) && (mark <= 79)) {
        grade = ("R");
       } else if ((mark >= 60) && (mark <= 69)) {
        grade = ("U");
       } else if ((mark >= 0) && (mark <= 59)) {
        grade = ("V");
       } else {
        grade = "G"; // на случай некорректной оценки

       }
        return grade;
      }

 }
