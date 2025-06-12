package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_6_plus;

import java.util.ArrayList;
import java.util.List;

class SchoolDiary {
    Student student;
    List<Subject> subjects;

    public SchoolDiary(Student student) {
        this.student = student;
        this.subjects = new ArrayList<>();
    }

    public Student getStudent()      { return student; }

    double findAverageMarkOfAllSubjects() {
        double sumOfGrades = 0.0d;
        int countOfGrades = 0;
        for(Subject subject: subjects){
            sumOfGrades += subject.findAverageMarkOfSubject();
            countOfGrades += 1;
        }
        if(countOfGrades > 0) {
            return sumOfGrades / countOfGrades * 1.0d;
        }
        else {
            return 0.0d;
        }
    }
}
