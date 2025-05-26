package org.javaguru.student_alexey_yakovlev.project_0_first_method_creation;

class GradeCalculator {

    String calculateGrade(int mark) {
        if (mark >= 90 && mark <= 100) {
            return "A";
        } else if (mark >= 80 && mark < 90) {
            return "B";
        } else if (mark >= 70 && mark < 80) {
            return "C";
        } else if (mark >= 60 && mark < 70) {
            return "D";
        } else {
            return "F";
        }
    }
}
