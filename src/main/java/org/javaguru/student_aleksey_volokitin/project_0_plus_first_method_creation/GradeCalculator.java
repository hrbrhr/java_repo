package org.javaguru.student_aleksey_volokitin.project_0_plus_first_method_creation;

class GradeCalculator {
    String calculateGrade(int mark) {
        String grade = "";

        if (markOver90AndUnder100(mark)) {
            grade = "A";
        } else if (markOver80AndUnder89(mark)) {
            grade = "B";
        } else if (markOver70AndUnder79(mark)) {
            grade = "C";
        } else if (markOver60AndUnder69(mark)) {
            grade = "D";
        } else if (markOver0AndUnder59(mark)) {
            grade = "F";
        }
        return grade;
    }
    boolean markOver90AndUnder100 (int mark) { return (mark >= 90) && (mark <= 100); }
    boolean markOver80AndUnder89  (int mark) { return (mark >= 80) && (mark <= 89); }
    boolean markOver70AndUnder79  (int mark) { return (mark >= 70) && (mark <= 79); }
    boolean markOver60AndUnder69  (int mark) { return (mark >= 60) && (mark <= 69); }
    boolean markOver0AndUnder59   (int mark) { return (mark >= 0)  && (mark <= 59); }
}
