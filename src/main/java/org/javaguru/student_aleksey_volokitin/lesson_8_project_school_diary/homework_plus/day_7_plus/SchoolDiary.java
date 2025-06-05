package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_7_plus;

import java.util.ArrayList;
import java.util.List;

class SchoolDiary {
    private Student student;
    private List<Subject> subjects;

    public SchoolDiary(Student student) {
        this.student = student;
        this.subjects = new ArrayList<>();
    }

    public Student getStudent()      { return student; }
    public List<Subject> getSubjects() { return subjects; }

    public void addSubjects(Subject subject) {
        subjects.add(subject);
    }

    double findAverageMarkOfAllSubjects() {
        double sumOfGrades = 0.0d;
        int countOfGrades = 0;
        for(Subject subject: subjects){
            sumOfGrades += subject.findAverageMarkOfSubject();
            countOfGrades += 1;
        }
        if(countOfGrades > 0) {
            return sumOfGrades / (double) countOfGrades;
        }
        else {
            return 0.0d;
        }
    }
}
