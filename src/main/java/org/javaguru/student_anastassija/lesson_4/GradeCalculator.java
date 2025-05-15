package org.javaguru.student_anastassija.lesson_4;

class GradeCalculator {
//A для 90-100, B для 80-89, C для 70-79, D для 60-69 и F для 0-59

        String calculateGrade(int mark){
            String grade;

            if ((mark >= 90) && (mark <= 100)) {
                grade = "A";
            } else if ((mark >= 80) && (mark <= 89)) {
                grade = "B";
            } else if ((mark >= 70) && (mark <= 79)) {
                grade = "C";
            } else if ((mark >= 60) && (mark <= 69)) {
                grade = "D";
            } else {
                grade = "F";
            }

            return grade;
        }
    }
